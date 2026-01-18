package pl.wsb.fitnesstracker.training.internal;

import pl.wsb.fitnesstracker.training.api.Training;
import pl.wsb.fitnesstracker.training.api.TrainingProvider;

import java.util.Optional;

/**
 * Implementation of {@link TrainingProvider} interface.
 * Provides business logic for retrieving training sessions.
 *
 * TODO: Provide Implementation and correct the return type of the method getTraining
 */
public class TrainingServiceImpl implements TrainingProvider {

    /**
     * Retrieves a training session by its unique identifier.
     *
     * @param trainingId id of the training to be searched.
     * @return An {@link Optional} containing the training if found, or empty otherwise.
     * @throws UnsupportedOperationException as the method is not yet implemented.
     */
    @Override
    public Optional<Training> getTraining(final Long trainingId) {
        throw new UnsupportedOperationException("Not finished yet");
    }


}
