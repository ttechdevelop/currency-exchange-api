package repository;

import java.sql.SQLException;

import model.Currency;

import java.util.Optional;

public interface CurrencyRepositoryInterface extends CrudRepositoryInterface<Currency> {

    Optional<Currency> findByCode(Long id) throws SQLException;

}
