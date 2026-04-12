package com.io.github.nadya.taskTracker.dto.read;

import com.io.github.nadya.taskTracker.entity.TaskPriority;
import com.io.github.nadya.taskTracker.entity.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class TaskResponseDto {
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
