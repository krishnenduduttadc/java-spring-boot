package com.example.demo5.controller;

import com.example.demo5.service.MathService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/math")
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/square/{num}")
    public int getSquare(@PathVariable int num) {
        return mathService.square(num);
    }
}
