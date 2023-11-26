package com.currency.tracing.store.repositories;

import com.currency.tracing.store.entity.DollarExchangeRateEntity;
import com.currency.tracing.store.entity.PoundSterlingExchangeRateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface PoundSterlingExchangeRateRepository
        extends JpaRepository<PoundSterlingExchangeRateEntity, Long> {
    Optional<PoundSterlingExchangeRateEntity> findByDate(LocalDate date);

}
