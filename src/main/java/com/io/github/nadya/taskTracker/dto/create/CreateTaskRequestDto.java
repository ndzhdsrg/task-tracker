package com.io.github.nadya.taskTracker.dto.create;

import com.io.github.nadya.taskTracker.entity.TaskPriority;
import com.io.github.nadya.taskTracker.entity.TaskStatus;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreateTaskRequestDto {
    private String title;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDateTime createdAt;
}
