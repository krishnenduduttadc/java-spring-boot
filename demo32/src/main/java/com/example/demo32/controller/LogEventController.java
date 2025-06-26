package com.example.demo32.controller;

import com.example.demo32.model.LogEvent;
import com.example.demo32.repository.LogEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/logs")
public class LogEventController {

    @Autowired
    private LogEventRepository repo;

    @PostMapping("/create")
    public LogEvent create(@RequestBody LogEvent log) {
        log.setId(UUID.randomUUID().toString());
        log.setTimestamp(System.currentTimeMillis());
        return repo.save(log);
    }

    @GetMapping("/all")
    public Iterable<LogEvent> getAll() {
        return repo.findAll();
    }
}
