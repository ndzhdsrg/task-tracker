package com.io.github.nadya.taskTracker.repository;

import com.io.github.nadya.taskTracker.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TaskRepository — это интерфейс, который используется для работы с базой данных через Spring Data JPA.
 * Он объявляется как public interface TaskRepository extends JpaRepository<TaskEntity, Long>,
 * где TaskEntity — это класс сущности, с которой будет работать репозиторий,
 * а Long — тип поля, помеченного как @Id (первичный ключ).
 *
 * Наследование от JpaRepository означает, что тебе не нужно писать реализацию этого интерфейса:
 * Spring автоматически создаёт её во время запуска приложения.
 * Благодаря этому можно сразу получать готовые методы для работы с данными, такие как
 * save, findById, findAll, deleteById, existsById и другие.
 * Интерфейс остаётся пустым, потому что базовый CRUD уже реализован внутри JpaRepository.
 *
 * При необходимости можно добавить свои методы, например findByStatus, и Spring сам сгенерирует
 * соответствующий SQL-запрос на основе имени метода.
 *
 * Таким образом, этот интерфейс является декларацией репозитория, через который с
 * ервисный слой будет взаимодействовать с базой данных, не зная деталей реализации.
 *
 */
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
