package com.spring.study.demo4.demo4_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
//Aspect注解不是在spring包下
@Aspect
public class Advice {

    //声明为切点
    @Pointcut("execution(* com.spring.study.demo4.demo4_1.Action.doSomething(..))")
    public void doSomething(){}

    //前置通知，Before中的内容表示的是切点
    //* : 返回任意类型
    // .. : 使用任意参数
//    @Before("execution(* com.spring.study.demo4.demo4_1.Action.doSomething(..))")
    @Before("doSomething()")
    public void deBefore() {
        System.out.println("执行前置通知");
    }

//    @AfterReturning("execution(* com.spring.study.demo4.demo4_1.Action.doSomething(..))")
    @AfterReturning("doSomething()")
    public void deReturn() {
        System.out.println("方法执行完成通知");
    }

    //After先执行，然后才会执行相应的AfterThrowing、AfterReturning
//    @After("execution(* com.spring.study.demo4.demo4_1.Action.doSomething(..))")
    @After("doSomething()")
    public void deAfter() {
        System.out.println("执行后置通知");
    }

//    @AfterThrowing("execution(* com.spring.study.demo4.demo4_1.Action.doSomething(..))")
    @AfterThrowing("doSomething()")
    public void deThrow() {
        System.out.println("执行后置异常通知");
    }

    //Around尽量不要与其他通知一起使用，可能会导致一些通知失效
    @Around("doSomething()")
    public void doAround(ProceedingJoinPoint jp){
        try {
            System.out.println("Around : 方法执行之前");
            jp.proceed();
            System.out.println("Around : 方法执行之后");
        } catch (Throwable throwable) {
            System.out.println("抛出异常");
        }
    }
}
