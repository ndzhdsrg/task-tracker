package com.io.github.nadya.taskTracker.service;

import com.io.github.nadya.taskTracker.dto.create.CreateTaskRequestDto;
import com.io.github.nadya.taskTracker.dto.read.TaskResponseDto;
import com.io.github.nadya.taskTracker.dto.update.UpdateTaskStatusRequestDto;
import com.io.github.nadya.taskTracker.dto.update.UpdateTaskStatusResponseDto;
import com.io.github.nadya.taskTracker.entity.TaskStatus;

import java.util.List;

public interface TaskService {
    //Создать задачу
    Long createTask(CreateTaskRequestDto requestDto);

    //Получить список всех задач
    List<TaskResponseDto> returnAllTasksList();

    //Получить одну задачу
    TaskResponseDto getTask(Long id);

    //Обновить статус задачи
    UpdateTaskStatusResponseDto updateTaskStatus(Long id, UpdateTaskStatusRequestDto requestDto);
}

