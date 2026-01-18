package pl.wsb.fitnesstracker.statistics.api;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.user.api.User;

/**
 * Represents the aggregated statistics for a user in the fitness tracker system.
 * This entity maps to the "statistics" table in the database.
 */
@Entity
@Table(name = "statistics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Statistics {

    /**
     * The unique identifier for the statistics record.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    /**
     * The user associated with these statistics.
     */
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    /**
     * The total number of training sessions completed by the user.
     */
    @Column(name = "total_trainings", nullable = false)
    private int totalTrainings;

    /**
     * The total distance covered by the user in all trainings.
     */
    @Column(name = "total_distance")
    private double totalDistance;

    /**
     * The total number of calories burned by the user.
     */
    @Column(name = "total_calories_burned")
    private int totalCaloriesBurned;

    /**
     * Constructs a new Statistics record with the specified details.
     *
     * @param id                  the unique identifier.
     * @param user                the user associated with the statistics.
     * @param totalTrainings      the total number of trainings.
     * @param totalDistance       the total distance covered.
     * @param totalCaloriesBurned the total calories burned.
     */
    public Statistics(@Nullable Long id, User user, int totalTrainings, double totalDistance, int totalCaloriesBurned) {
        this.id = id;
        this.user = user;
        this.totalTrainings = totalTrainings;
        this.totalDistance = totalDistance;
        this.totalCaloriesBurned = totalCaloriesBurned;
    }
}
