package pl.wsb.fitnesstracker.training.api;

import pl.wsb.fitnesstracker.exception.api.NotFoundException;

/**
 * Exception indicating that the {@link Training} was not found.
 */
@SuppressWarnings("squid:S110")
public class TrainingNotFoundException extends NotFoundException {

    /**
     * Constructs a new TrainingNotFoundException with the specified detail message.
     *
     * @param message the detail message.
     */
    private TrainingNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new TrainingNotFoundException for a specific training ID.
     *
     * @param id the ID of the training that was not found.
     */
    public TrainingNotFoundException(Long id) {
        this("Training with ID=%s was not found".formatted(id));
    }

}
