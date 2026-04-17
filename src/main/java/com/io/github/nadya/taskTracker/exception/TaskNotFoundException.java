package com.io.github.nadya.taskTracker.exception;

import org.springframework.http.HttpStatus;

public class TaskNotFoundException extends BaseAppException {
    public TaskNotFoundException(Long id) {
        super("Задача с id: "+ id + " не найдена", "TASK_NOT_FOUND", HttpStatus.NOT_FOUND);
    }
}
