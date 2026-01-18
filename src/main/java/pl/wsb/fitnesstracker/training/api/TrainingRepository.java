package pl.wsb.fitnesstracker.training.api;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wsb.fitnesstracker.user.api.User;

import java.util.List;
import java.util.Date;

/**
 * Repository interface for accessing and managing {@link Training} entities in the database.
 * Extends {@link JpaRepository} to provide standard CRUD operations.
 */
public interface TrainingRepository extends JpaRepository<Training, Long> {
    List<Training> findByUser_IdAndEndTimeAfter(Long userId, Date date);
}
