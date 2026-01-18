package pl.wsb.fitnesstracker.training.api;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing and managing {@link Training} entities in the database.
 * Extends {@link JpaRepository} to provide standard CRUD operations.
 */
public interface TrainingRepository extends JpaRepository<Training, Long> {
}
