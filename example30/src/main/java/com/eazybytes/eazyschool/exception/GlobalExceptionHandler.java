package com.eazybytes.eazyschool.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public String handleExceptionsGlobally(Exception exception){
        log.error("Flow is reaching to the GlobalExceptionHandler : handleExceptionsGlobally method");
        return exception.getMessage();
    }
}
