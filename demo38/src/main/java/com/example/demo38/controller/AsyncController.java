package com.example.demo38.controller;

import com.example.demo38.service.BackgroundTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/async")
public class AsyncController {

    @Autowired
    private BackgroundTaskService taskService;

    @GetMapping
    public String triggerAsyncTask() {
        taskService.runAsyncTask();
        return "Task started!";
    }
}
