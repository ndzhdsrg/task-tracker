package com.io.github.nadya.taskTracker.dto.create;

import com.io.github.nadya.taskTracker.entity.TaskPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTaskRequestDto {
    @NotBlank(message = "Укажите название задачи")
    private String title;
    @NotNull(message = "Установите приоритет задачи")
    private TaskPriority priority;
}
