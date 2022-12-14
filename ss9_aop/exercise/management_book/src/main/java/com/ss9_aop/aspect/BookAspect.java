package com.ss9_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class BookAspect {
    @After("execution(* com.ss9_aop.controller.BookController.submitOrder(..))")
    public void logAfterMethodBookController(JoinPoint joinPoint) {
        String nameMethod = joinPoint.getSignature().getName();
        System.out.println("Người mượn sách " + nameMethod + " vào lúc: " + LocalDateTime.now());
    }
}
