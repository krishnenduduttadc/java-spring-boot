package com.example.demo35.controller;

import com.example.demo35.service.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MyBean myBean;

    @GetMapping
    public String test() {
        myBean.doWork();
        return "Bean tested!";
    }
}
