package com.io.github.nadya.taskTracker.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Класс для вывода кастомных сообщений об ошибках
 * Так как есть аннотация @RestControllerAdvice - Spring сам подхватывает этот метод
 */
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(BaseAppException.class)
    public ResponseEntity<ErrorResponse> handleBaseException(BaseAppException ex) {

        ErrorResponse error = new ErrorResponse(
                ex.getMessage(),
                ex.getStatus().value()
        );

        return ResponseEntity
                .status(ex.getStatus())
                .body(error);
    }
}
