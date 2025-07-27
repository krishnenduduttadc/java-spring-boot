package com.example.demo37.controller;

import com.example.demo37.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/env")
public class MainController {

    @Autowired
    private MyService myService;

    @GetMapping
    public String checkEnv() {
        return myService.serve();
    }
}
