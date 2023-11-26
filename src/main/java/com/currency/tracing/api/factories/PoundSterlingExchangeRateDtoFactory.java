package com.currency.tracing.api.factories;

import com.currency.tracing.api.dto.PoundSterlingExchangeRateDto;
import com.currency.tracing.store.entity.PoundSterlingExchangeRateEntity;
import org.springframework.stereotype.Component;

@Component
public class PoundSterlingExchangeRateDtoFactory {
    public PoundSterlingExchangeRateDto makePoundDto(PoundSterlingExchangeRateEntity entity){
        return PoundSterlingExchangeRateDto
                .builder()
                .id(entity.getId())
                .date(entity.getDate())
                .course(entity.getCourse())
                .build();
    }
}
