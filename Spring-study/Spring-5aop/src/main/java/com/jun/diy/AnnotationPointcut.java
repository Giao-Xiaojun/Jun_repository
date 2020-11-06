package com.jun.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.ietf.jgss.Oid;

@Aspect
public class AnnotationPointcut {

    @Before("execution(* com.jun.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("======方法执行前======");
    }

    @After("execution(* com.jun.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("======方法执行后======");
    }

    @Around("execution(* com.jun.service.UserServiceImpl.*(..))")
    public void aroud(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        Signature signature = jp.getSignature();
        System.out.println(signature);
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}
