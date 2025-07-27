package com.example.demo36.controller;

import com.example.demo36.service.ScopedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scope")
public class TestController {

    @Autowired
    private ScopedBean scopedBean;

    @GetMapping
    public String getBeanId() {
        return "Bean ID: " + scopedBean.getId();
    }
}
