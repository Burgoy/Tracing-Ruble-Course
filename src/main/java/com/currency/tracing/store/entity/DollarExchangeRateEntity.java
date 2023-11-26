package com.currency.tracing.store.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "dollar_exchange_rate", schema = "courses")
public class DollarExchangeRateEntity {

    @Id
    @Column(name = "dollar_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @Column(name = "date")
    private LocalDate date;

    @Column(name = "course")
    private Double course;

}
