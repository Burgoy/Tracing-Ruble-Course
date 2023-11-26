package com.currency.tracing.store.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.cglib.core.Local;

import java.lang.reflect.Array;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "euro_exchange_rate", schema = "courses")
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EuroExchangeRateEntity {

    @Id
    @Column(name = "euro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "date")
    private LocalDate date;

    @Column(name = "course")
    private Double course;



}
