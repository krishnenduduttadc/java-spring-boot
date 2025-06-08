package com.example.demo3.service;


import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String process(String name) {
        return "Processing " + name;
    }
}

