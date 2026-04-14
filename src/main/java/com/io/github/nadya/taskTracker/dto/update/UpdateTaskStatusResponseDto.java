package com.io.github.nadya.taskTracker.dto.update;

import com.io.github.nadya.taskTracker.entity.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class UpdateTaskStatusResponseDto {
    private TaskStatus taskStatus;
    private LocalDateTime updatedAt;
    private Boolean updated;
}
