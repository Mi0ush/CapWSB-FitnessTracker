package pl.wsb.fitnesstracker.user.api;

/**
 * Service interface for managing {@link User} entities.
 * This API allows for creating and modifying user data.
 * Implementations should handle transaction management.
 */
public interface UserService {

    /**
     * Creates a new user in the system.
     *
     * @param user the {@link User} entity to be created.
     * @return the created {@link User} entity.
     */
    User createUser(User user);

}
