package pl.wsb.fitnesstracker.user.api;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Represents a user in the fitness tracker system.
 * This entity maps to the "users" table in the database.
 */
@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class User {

    /**
     * The unique identifier for the user.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    /**
     * The first name of the user.
     */
    @Column
    private String firstName;

    /**
     * The last name of the user.
     */
    @Column
    private String lastName;

    /**
     * The birthdate of the user.
     */
    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;

    /**
     * The email address of the user. Must be unique.
     */
    @Column(nullable = false, unique = true)
    private String email;

    /**
     * Constructs a new User with the specified details.
     *
     * @param firstName the first name of the user.
     * @param lastName  the last name of the user.
     * @param birthdate the birthdate of the user.
     * @param email     the email address of the user.
     */
    public User(
            final String firstName,
            final String lastName,
            final LocalDate birthdate,
            final String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.email = email;
    }

    /**
     * Gets the unique identifier of the user.
     *
     * @return the user ID, or null if not persisted.
     */
    @Nullable
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the user.
     *
     * @param id the user ID.
     */
    public void setId(@Nullable Long id) {
        this.id = id;
    }

    /**
     * Gets the first name of the user.
     *
     * @return the first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstName the first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the user.
     *
     * @return the last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the user.
     *
     * @param lastName the last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the birthdate of the user.
     *
     * @return the birthdate.
     */
    public LocalDate getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the birthdate of the user.
     *
     * @param birthdate the birthdate.
     */
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Gets the email address of the user.
     *
     * @return the email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the user.
     *
     * @param email the email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
