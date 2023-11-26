package com.currency.tracing.store.entity;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "pound_sterling_exchange_rate", schema = "courses")

@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)

public class PoundSterlingExchangeRateEntity {

    @Id
    @Column(name = "PoundSterling_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "course")
    private Double course;
}
