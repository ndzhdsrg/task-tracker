package com.io.github.nadya.taskTracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Entity
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    /**
     * Аннотация entity говорит spring о том, что этот класс нудно хранить в БД,
     * то есть класс становится сущностью и для него создается таблица.
     * Аннотация id нужна, чтобы spring знал уникальный идентификатор записи
     */
}
