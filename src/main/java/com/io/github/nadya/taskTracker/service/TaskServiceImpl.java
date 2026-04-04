package com.io.github.nadya.taskTracker.service;

import com.io.github.nadya.taskTracker.dto.create.CreateTaskRequestDto;
import com.io.github.nadya.taskTracker.entity.TaskEntity;
import com.io.github.nadya.taskTracker.entity.TaskStatus;
import com.io.github.nadya.taskTracker.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Long createTask(CreateTaskRequestDto requestDto) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitle(requestDto.getTitle());
        taskEntity.setStatus(TaskStatus.NEW);
        taskEntity.setPriority(requestDto.getPriority());
        taskEntity.setCreatedAt(LocalDateTime.now());
        TaskEntity saved = taskRepository.save(taskEntity);
        return  saved.getId();
    }
}

