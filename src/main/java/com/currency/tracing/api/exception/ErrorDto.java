package com.currency.tracing.api.exception;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ErrorDto extends ResponseEntityExceptionHandler {
    String errors;

    @JsonProperty("error_description")
    String errorDescription;
}
