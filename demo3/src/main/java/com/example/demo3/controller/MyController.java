package com.example.demo3.controller;

import com.example.demo3.service.MyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/process")
    public String process(@RequestParam String name) {
        return myService.process(name);
    }
}
