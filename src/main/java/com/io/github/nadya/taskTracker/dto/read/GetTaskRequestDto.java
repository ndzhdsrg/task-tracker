package com.io.github.nadya.taskTracker.dto.read;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class GetTaskRequestDto {
    @NotBlank(message = "Укажите название задачи")
    @Size(min = 3, max = 100, message = "Название должно содержать от 3 до 100 символов")
    private Long id;
}
