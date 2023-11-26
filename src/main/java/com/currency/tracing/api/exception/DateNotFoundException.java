package com.currency.tracing.api.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DateNotFoundException extends RuntimeException{
    public DateNotFoundException(String massage){
        super(massage);
    }
}
