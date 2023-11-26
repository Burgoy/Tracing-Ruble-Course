package com.currency.tracing.store.repositories;

import com.currency.tracing.store.entity.DollarExchangeRateEntity;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Optional;

public interface DollarExchangeRateRepository
        extends JpaRepository<DollarExchangeRateEntity, Long> {
    Optional<DollarExchangeRateEntity> findByDate(LocalDate date);

}
