package com.spring.study.demo4.demo4_4;

import org.aspectj.lang.ProceedingJoinPoint;

public class PersonAspect {
    public void doSayBefore(){
        System.out.println("say()的前置通知");
    }

    public void doCallBefore(PersonVo vo){
        System.out.println("call()的前置通知，age = " + vo.getAge() + ", name = " + vo.getName());
    }

    public void doCallAround(ProceedingJoinPoint jp, PersonVo vo){
        System.out.println("around执行之前，age = " + vo.getAge() + ", name = " + vo.getName());
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around执行之后");
    }
}
