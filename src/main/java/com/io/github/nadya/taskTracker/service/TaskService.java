package com.io.github.nadya.taskTracker.service;

import com.io.github.nadya.taskTracker.dto.create.CreateTaskRequestDto;
import com.io.github.nadya.taskTracker.dto.read.GetAllTasksResponseDto;

import java.util.List;

public interface TaskService {
    Long createTask(CreateTaskRequestDto requestDto);

    List<GetAllTasksResponseDto> returnAllTasksList();
}
