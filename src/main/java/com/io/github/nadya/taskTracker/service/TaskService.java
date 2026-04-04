package com.io.github.nadya.taskTracker.service;

import com.io.github.nadya.taskTracker.dto.create.CreateTaskRequestDto;

public interface TaskService {
    Long createTask(CreateTaskRequestDto requestDto);
}
