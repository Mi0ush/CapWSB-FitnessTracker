package pl.wsb.fitnesstracker.user.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;

import java.time.LocalDate;

/**
 * A Data Transfer Object (DTO) representing user information.
 *
 * @param id        the unique identifier of the user.
 * @param firstName the first name of the user.
 * @param lastName  the last name of the user.
 * @param birthdate the birthdate of the user.
 * @param email     the email address of the user.
 */
public record UserDto(@Nullable Long id, String firstName, String lastName,
                      @JsonFormat(pattern = "yyyy-MM-dd") LocalDate birthdate,
                      String email) {

}
