package com.example.demo7.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        int result = calculatorService.add(3, 4);
        assertEquals(7, result);
    }
}
