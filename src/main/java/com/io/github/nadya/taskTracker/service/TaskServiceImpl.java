package com.io.github.nadya.taskTracker.service;

import com.io.github.nadya.taskTracker.dto.create.CreateTaskRequestDto;
import com.io.github.nadya.taskTracker.dto.read.TaskResponseDto;
import com.io.github.nadya.taskTracker.dto.update.UpdateTaskStatusResponseDto;
import com.io.github.nadya.taskTracker.entity.TaskEntity;
import com.io.github.nadya.taskTracker.entity.TaskStatus;
import com.io.github.nadya.taskTracker.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<TaskResponseDto> returnAllTasksList(){
        //TODO вынести маппинг в отдельный метод
        return taskRepository.findAll().stream() //обратиться к абстракции для работы с БД
                .map(taskEntity -> new TaskResponseDto(
                        taskEntity.getId(),
                        taskEntity.getTitle(),
                        taskEntity.getDescription(),
                        taskEntity.getStatus(),
                        taskEntity.getPriority(),
                        taskEntity.getCreatedAt(),
                        taskEntity.getUpdatedAt()
                ))
                .toList();
    }

    @Override
    public TaskResponseDto getTask(Long id){
        //TODO вынести маппинг в отдельный метод
        return taskRepository.findById(id)
                .map(taskEntity -> new TaskResponseDto(
                        taskEntity.getId(),
                        taskEntity.getTitle(),
                        taskEntity.getDescription(),
                        taskEntity.getStatus(),
                        taskEntity.getPriority(),
                        taskEntity.getCreatedAt(),
                        taskEntity.getUpdatedAt()
                ))
                .orElseThrow(() -> new RuntimeException("По id " + id + " ничего не найдено"));
    }

    @Override
    public UpdateTaskStatusResponseDto updateTaskStatus(Long id, TaskStatus status) {
        UpdateTaskStatusResponseDto responseDto = new UpdateTaskStatusResponseDto();
        Optional<TaskEntity> task = taskRepository.findById(id);
        responseDto.se
        task.get().setStatus(status);
        task.get().setUpdatedAt(LocalDateTime.now());



    }
}
