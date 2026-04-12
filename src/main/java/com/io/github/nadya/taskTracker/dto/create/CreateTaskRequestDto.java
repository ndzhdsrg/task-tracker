package com.io.github.nadya.taskTracker.dto.create;

import com.io.github.nadya.taskTracker.entity.TaskPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTaskRequestDto {
    @NotBlank(message = "Укажите название задачи")
    @Size(min = 3, max = 100, message = "Название должно содержать от 3 до 100 символов")
    private String title;
    @NotNull(message = "Установите приоритет задачи")
    private TaskPriority priority;
    @Size(max = 500, message = "Описание должно содержать до 500 символов")
    private String description;
}
