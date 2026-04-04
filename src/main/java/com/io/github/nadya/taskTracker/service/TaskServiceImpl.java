package com.io.github.nadya.taskTracker.service;

import com.io.github.nadya.taskTracker.dto.create.CreateTaskRequestDto;
import com.io.github.nadya.taskTracker.dto.create.CreateTaskResponseDto;
import com.io.github.nadya.taskTracker.entity.TaskEntity;
import com.io.github.nadya.taskTracker.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    public TaskServiceImpl(TaskRepository taskRepository){
    }

    @Override
    public CreateTaskResponseDto createTask(CreateTaskRequestDto requestDto) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitle(requestDto.getTitle());
        taskEntity.set
    }
}

