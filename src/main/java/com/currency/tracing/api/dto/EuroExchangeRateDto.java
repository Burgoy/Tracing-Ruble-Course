package com.currency.tracing.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EuroExchangeRateDto{

    @NonNull
    private Long id;

    @NonNull
    private Double course;

    @NonNull
    @JsonProperty("date")
    LocalDate date;
}
