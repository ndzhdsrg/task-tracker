package com.io.github.nadya.taskTracker.controller;

import com.io.github.nadya.taskTracker.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskPageController {

    private final TaskService taskService;

    public TaskPageController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks-ui")
    public String getTasksPage(Model model) {
        model.addAttribute("task", taskService.returnAllTasksList());
        return "task"; // имя HTML файла без .html
    }
}
