package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Represents an event in the fitness tracker system.
 * This entity maps to the "event" table in the database.
 */
@Entity
@Table(name = "event")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Event {

    /**
     * The unique identifier for the event.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the event.
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * A detailed description of the event.
     */
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    /**
     * The date and time when the event starts.
     */
    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    /**
     * The date and time when the event ends.
     */
    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    /**
     * The country where the event takes place.
     */
    @Column(name = "country")
    private String country;

    /**
     * The city where the event takes place.
     */
    @Column(name = "city")
    private String city;

}
