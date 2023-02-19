package com.tryJpa.TryJpa.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class startAspect {

    @Before("execution(public String hello())")
    public void getStartAdvice(){
        System.out.println("123");
    }
}
