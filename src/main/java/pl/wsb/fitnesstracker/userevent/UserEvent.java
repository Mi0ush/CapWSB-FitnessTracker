package pl.wsb.fitnesstracker.userevent;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.event.Event;
import pl.wsb.fitnesstracker.user.api.User;

/**
 * Represents the association between a user and an event in the fitness tracker system.
 * This entity maps to the "user_event" table in the database.
 */
@Entity
@Table(name = "user_event")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class UserEvent {

    /**
     * The unique identifier for the user-event association.
     */
    @Id
    private Long Id;

    /**
     * The user associated with the event.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    /**
     * The event associated with the user.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    /**
     * The status of the user's participation in the event.
     */
    @Column(name = "status")
    private String status;
}
