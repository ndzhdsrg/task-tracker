package com.io.github.nadya.taskTracker.controller;

import com.io.github.nadya.taskTracker.dto.create.CreateTaskRequestDto;
import com.io.github.nadya.taskTracker.dto.read.TaskResponseDto;
import com.io.github.nadya.taskTracker.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  Слой controller служит для работы с http
 *  Может принять запрос и вернуть ответ
 *  Может проверять входные данные запроса
 *  Для обработки HTTP запроса вызывает сервисный слой
 *  В качестве ответа возвращает DTO
 *  !Не должен содержать бизнес-логику
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //возвращает статус код 201
    public Long createTask(@Valid @RequestBody CreateTaskRequestDto requestDto) {
        return taskService.createTask(requestDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TaskResponseDto> getAllTasks() {
        return taskService.returnAllTasksList();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TaskResponseDto getTask(@PathVariable("id") Long id) {
        return taskService.getTask(id);
    }
}
