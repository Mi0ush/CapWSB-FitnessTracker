package pl.wsb.fitnesstracker.user.internal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.wsb.fitnesstracker.user.api.User;
import pl.wsb.fitnesstracker.user.api.UserProvider;
import pl.wsb.fitnesstracker.user.api.UserService;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of {@link UserService} and {@link UserProvider} interfaces.
 * Provides business logic for managing users, including creation and retrieval.
 */
@Service
@Slf4j
class UserServiceImpl implements UserService, UserProvider {

    private final UserRepository userRepository;

    /**
     * Constructs a new UserServiceImpl with the specified repository.
     *
     * @param userRepository the repository for accessing user data.
     */
    UserServiceImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Creates a new user in the system.
     *
     * @param user The user to be created.
     * @return The created user entity.
     * @throws IllegalArgumentException if the user already has an ID (update not permitted).
     */
    @Override
    public User createUser(final User user) {
        if (user.getId() != null) {
            throw new IllegalArgumentException("User has already DB ID, update is not permitted!");
        }
        return userRepository.save(user);
    }

    /**
     * Retrieves a user by their unique identifier.
     *
     * @param userId id of the user to be searched.
     * @return An {@link Optional} containing the user if found, or empty otherwise.
     */
    @Override
    public Optional<User> getUser(final Long userId) {
        return userRepository.findById(userId);
    }

    /**
     * Retrieves a user by their email address.
     *
     * @param email The email of the user to be searched.
     * @return An {@link Optional} containing the user if found, or empty otherwise.
     */
    @Override
    public Optional<User> getUserByEmail(final String email) {
        return userRepository.findByEmail(email);
    }

    /**
     * Retrieves all users in the system.
     *
     * @return A list of all users.
     */
    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

}
