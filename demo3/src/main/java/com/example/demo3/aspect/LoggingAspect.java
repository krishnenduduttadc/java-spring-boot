package com.example.demo3.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo3.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("🚀 Before method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "execution(* com.example.demo3.service.*.*(..))", returning = "result")
    public void logAfter(JoinPoint joinPoint, Object result) {
        System.out.println("✅ After method: " + joinPoint.getSignature().getName() + ", Result: " + result);
    }
}
