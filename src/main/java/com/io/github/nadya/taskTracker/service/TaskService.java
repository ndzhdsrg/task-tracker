package com.io.github.nadya.taskTracker.service;

import com.io.github.nadya.taskTracker.dto.create.CreateTaskRequestDto;
import com.io.github.nadya.taskTracker.dto.read.TaskResponseDto;

import java.util.List;

public interface TaskService {
    //Создать задачу
    Long createTask(CreateTaskRequestDto requestDto);
    //Получить список всех задач
    List<TaskResponseDto> returnAllTasksList();
    //Получить одну задачу
     TaskResponseDto getTask(Long id);
}
