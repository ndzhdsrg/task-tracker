package com.io.github.nadya.taskTracker.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class ErrorResponse {

    private final String message;
    private final int status;

    public ErrorResponse(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }
}