package com.io.github.nadya.taskTracker.dto.create;

import ch.qos.logback.core.status.Status;
import com.io.github.nadya.taskTracker.entity.TaskPriority;
import com.io.github.nadya.taskTracker.entity.TaskStatus;

public class CreateTaskRequestDto {
    private String title;
    private TaskStatus status;
    private TaskPriority priority;
}
