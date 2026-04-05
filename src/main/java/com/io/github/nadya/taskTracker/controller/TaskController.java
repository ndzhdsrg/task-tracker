package com.io.github.nadya.taskTracker.controller;

import com.io.github.nadya.taskTracker.dto.create.CreateTaskRequestDto;
import com.io.github.nadya.taskTracker.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Long createTask(@Valid @RequestBody CreateTaskRequestDto requestDto) {
        return taskService.createTask(requestDto);
    }
}
