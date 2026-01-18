package pl.wsb.fitnesstracker.training.internal;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import pl.wsb.fitnesstracker.training.api.Training;
import pl.wsb.fitnesstracker.training.api.TrainingRepository;
import pl.wsb.fitnesstracker.user.api.User;
import pl.wsb.fitnesstracker.user.api.UserProvider;


import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
class TrainingReportService {

    private final TrainingRepository trainingRepository;
    private final UserProvider userProvider;

    // Cron: "0 0 0 * * MON" -> w każdy poniedziałek o północy.
    @Scheduled(fixedRate = 30000)
    public void generateWeeklyReport() {
        log.info(">>> Starting weekly report generation...");

        List<User> users = userProvider.findAllUsers();
        Date oneWeekAgo = getOneWeekAgoDate();
        log.info("Tydzien: {}", oneWeekAgo);
        for (User user : users) {
            generateConsoleReport(user, oneWeekAgo);
        }

        log.info(">>> Report generation finished.");
    }

    private void generateConsoleReport(User user, Date dateLimit) {
        List<Training> recentTrainings = trainingRepository.findByUser_IdAndEndTimeAfter(user.getId(), dateLimit);
        log.info("User: {} (ID: {}). Week: {} Recent trainings count: {}", user.getEmail(), user.getId(), getOneWeekAgoDate(), recentTrainings.size());
    }

    private Date getOneWeekAgoDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -7);
        return calendar.getTime();
    }
}