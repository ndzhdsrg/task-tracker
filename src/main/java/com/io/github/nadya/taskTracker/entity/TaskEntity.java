package com.io.github.nadya.taskTracker.entity;

import lombok.*;

import java.time.LocalDateTime;

/**
 * Отражает схему сущности так, как она есть в БД
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TaskEntity {
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
