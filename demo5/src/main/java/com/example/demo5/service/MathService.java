package com.example.demo5.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    @Cacheable("squareCache")
    public int square(int number) {
        System.out.println("Calculating square of " + number);
        try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
        return number * number;
    }
}
