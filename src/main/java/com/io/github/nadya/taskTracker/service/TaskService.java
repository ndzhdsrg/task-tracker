package com.io.github.nadya.taskTracker.service;

import com.io.github.nadya.taskTracker.dto.create.CreateTaskRequestDto;
import com.io.github.nadya.taskTracker.dto.create.CreateTaskResponseDto;

public interface TaskService {
    CreateTaskResponseDto createTask(CreateTaskRequestDto requestDto);
}
