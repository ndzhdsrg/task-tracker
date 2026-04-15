package com.io.github.nadya.taskTracker.dto.update;

import com.io.github.nadya.taskTracker.entity.TaskStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UpdateTaskStatusRequestDto {
    @NotNull(message = "Установите статус задачи")
    private TaskStatus status;
}
