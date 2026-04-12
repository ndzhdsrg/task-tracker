package com.io.github.nadya.taskTracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskPageController {

    @GetMapping("/tasks-ui")
    public String getTasksPage(Model model) {
        return "task"; // имя HTML файла без .html
    }
}
