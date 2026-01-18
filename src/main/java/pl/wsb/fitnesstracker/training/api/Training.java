package pl.wsb.fitnesstracker.training.api;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.training.internal.ActivityType;
import pl.wsb.fitnesstracker.user.api.User;

import java.util.Date;

/**
 * Represents a training session in the fitness tracker system.
 * This entity maps to the "trainings" table in the database.
 */
@Entity
@Table(name = "trainings")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Training {

    /**
     * The unique identifier for the training session.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The user who performed the training.
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    /**
     * The start time of the training session.
     */
    @Column(name = "start_time", nullable = false)
    private Date startTime;

    /**
     * The end time of the training session.
     */
    @Column(name = "end_time", nullable = false)
    private Date endTime;

    /**
     * The type of activity performed during the training (e.g., RUNNING, CYCLING).
     */
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "activity_type", nullable = false)
    private ActivityType activityType;

    /**
     * The distance covered during the training in kilometers.
     */
    @Column(name = "distance")
    private double distance;

    /**
     * The average speed during the training in km/h.
     */
    @Column(name = "average_speed")
    private double averageSpeed;

    /**
     * Constructs a new Training session with the specified details.
     *
     * @param user         the user who performed the training.
     * @param startTime    the start time of the training.
     * @param endTime      the end time of the training.
     * @param activityType the type of activity.
     * @param distance     the distance covered.
     * @param averageSpeed the average speed.
     */
    public Training(
            final User user,
            final Date startTime,
            final Date endTime,
            final ActivityType activityType,
            final double distance,
            final double averageSpeed) {
        this.user = user;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activityType = activityType;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }

}
