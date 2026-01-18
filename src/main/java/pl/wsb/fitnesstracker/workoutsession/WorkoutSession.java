package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.wsb.fitnesstracker.training.api.Training;

import java.time.LocalDateTime;

/**
 * Represents a specific session within a training, tracking details like location and time.
 * This entity maps to the "workout_session" table in the database.
 */
@Entity
@Table(name = "workout_session")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WorkoutSession {

    /**
     * The unique identifier for the workout session.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The training associated with this session.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "training_id", nullable = false)
    private Training training;

    /**
     * The timestamp when the session data was recorded.
     */
    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    /**
     * The latitude at the start of the session.
     */
    @Column(name = "start_latitude", nullable = false)
    private double startLatitude;

    /**
     * The longitude at the start of the session.
     */
    @Column(name = "start_longitude", nullable = false)
    private double startLongitude;

    /**
     * The latitude at the end of the session.
     */
    @Column(name = "end_latitude")
    private Double endLatitude;

    /**
     * The longitude at the end of the session.
     */
    @Column(name = "end_longitude")
    private Double endLongitude;

    /**
     * The altitude recorded during the session.
     */
    @Column(name = "altitude")
    private Double altitude;

}
