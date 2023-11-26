package com.currency.tracing.store.repositories;

import com.currency.tracing.store.entity.DollarExchangeRateEntity;
import com.currency.tracing.store.entity.EuroExchangeRateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface EuroExchangeRateRepository
        extends JpaRepository<EuroExchangeRateEntity, Long> {
    Optional<EuroExchangeRateEntity> findByDate(LocalDate date);
}
