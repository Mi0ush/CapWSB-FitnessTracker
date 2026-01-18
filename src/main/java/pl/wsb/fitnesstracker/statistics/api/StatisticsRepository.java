package pl.wsb.fitnesstracker.statistics.api;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing and managing {@link Statistics} entities in the database.
 * Extends {@link JpaRepository} to provide standard CRUD operations.
 */
public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
}
