package com.currency.tracing.api.exception;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;
import java.util.logging.ErrorManager;

@Controller
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ExceptionController implements ErrorController {
    private static final String PATH = "/errors";

    public String getErrorPath(){return PATH;}

    ErrorAttributes errorAttributes;

    @RequestMapping(ExceptionController.PATH)
    public ResponseEntity<ErrorDto> errorResponseEntity(WebRequest req){

        Map<String, Object> attributes = errorAttributes.getErrorAttributes(
                req,
                ErrorAttributeOptions.of(
                        ErrorAttributeOptions.Include.EXCEPTION,
                        ErrorAttributeOptions.Include.MESSAGE
                )
        );

        return ResponseEntity
                .status((Integer) attributes.get("status"))
                .body(ErrorDto
                        .builder()
                        .errors((String) attributes.get("error"))
                        .errorDescription((String) attributes.get("message"))
                        .build());
    }
}
