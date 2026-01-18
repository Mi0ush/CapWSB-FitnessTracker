package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.persistence.*;
import lombok.Getter;
import pl.wsb.fitnesstracker.user.api.User;

import java.time.LocalDate;

/**
 * Entity class representing health metrics for a user.
 * This class maps to the "Health_Metrics" table in the database and stores information
 * such as weight, height, and heart rate recorded on a specific date.
 */
@Entity
@Table(name = "Health_Metrics")
@Getter
public class HealthMetrics {

    /**
     * The unique identifier for the health metric record.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The user to whom these health metrics belong.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    /**
     * The date when the health metrics were recorded.
     */
    @Column(name = "date", nullable = false)
    private LocalDate date;

    /**
     * The weight of the user in kilograms.
     */
    @Column
    private Double weight;

    /**
     * The height of the user in centimeters.
     */
    @Column
    private Double height;

    /**
     * The heart rate of the user in beats per minute.
     */
    @Column(name = "heart_rate")
    private Integer heartRate;

    /**
     * Default constructor for JPA.
     */
    public HealthMetrics() {
    }

    /**
     * Constructs a new HealthMetrics record with the specified details.
     *
     * @param user      the user associated with these metrics.
     * @param date      the date of the record.
     * @param weight    the weight of the user.
     * @param height    the height of the user.
     * @param heartRate the heart rate of the user.
     */
    public HealthMetrics(User user, LocalDate date, Double weight, Double height, Integer heartRate) {
        this.user = user;
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.heartRate = heartRate;
    }


}
