package com.io.github.nadya.taskTracker.dto;

import com.io.github.nadya.taskTracker.entity.TaskPriority;
import com.io.github.nadya.taskTracker.entity.TaskStatus;

import java.time.LocalDateTime;

/**
 * Объект для передачи данных между слоями или наружу (API).
 *
 * Назначение:
 * 	•	формирование ответа клиенту
 * 	•	изоляция внутренней модели
 * 	•	контроль структуры данных
 */
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
