package com.currency.tracing.api.factories;

import com.currency.tracing.api.dto.DollarExchangeRateDto;
import com.currency.tracing.store.entity.DollarExchangeRateEntity;
import org.springframework.stereotype.Component;

@Component
public class DollarExchangeRateDtoFactory {

    public DollarExchangeRateDto makeDollarDto(DollarExchangeRateEntity entity){
        return DollarExchangeRateDto.builder()
                .id(entity.getId())
                .date(entity.getDate())
                .course(entity.getCourse())
                .build();
    }
}
