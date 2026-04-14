package com.io.github.nadya.taskTracker.dto.update;

import com.io.github.nadya.taskTracker.entity.TaskStatus;
import jakarta.validation.constraints.NotNull;

public class UpdateTaskStatusRequestDto {
    @NotNull(message = "Передайте id задачи")
    private Long id;
    @NotNull(message = "Установите статус задачи")
    private TaskStatus status;
}
