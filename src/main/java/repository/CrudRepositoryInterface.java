package repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface CrudRepositoryInterface<T> {

    /**
     * Save (create) а new entity.
     */
    void save(T entity) throws SQLException;

    /**
     * Find (read) an entity by ID.
     */
    Optional<T> findById(Long id) throws SQLException;

    /**
     * Find (read) all entities.
     * @return list of all entities.
     */
    List<T> findAll() throws SQLException;

    /**
     * Update an existing entity.
     * @param entity to update.
     */
    void update(T entity) throws SQLException;


    /**
     * Delete entity by ID.
     * @param id entity for delete
     */
    void delete(Long id) throws SQLException;
}