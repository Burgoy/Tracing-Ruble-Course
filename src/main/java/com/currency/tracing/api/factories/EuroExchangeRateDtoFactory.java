package com.currency.tracing.api.factories;

import com.currency.tracing.api.dto.EuroExchangeRateDto;
import com.currency.tracing.store.entity.EuroExchangeRateEntity;
import org.springframework.stereotype.Component;

@Component
public class EuroExchangeRateDtoFactory {
    public EuroExchangeRateDto makeEuroDto(EuroExchangeRateEntity entity){
        return EuroExchangeRateDto
                .builder()
                .id(entity.getId())
                .course(entity.getCourse())
                .date(entity.getDate())
                .build();
    }
}
