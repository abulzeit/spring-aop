package com.app.aop.springboot.spring_aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingServicePointcuts {
    
    @Pointcut("execution(* com.andres.curso.springboot.app.aop.springbootaop.services.GreetingService.*(..))")
    public void greetingLoggerPointCut() {
    }
    
    @Pointcut("execution(* com.andres.curso.springboot.app.aop.springbootaop.services.GreetingService.*(..))")
    public void greetingFooLoggerPointCut() {
    }
}
