package com.spring.study.demo4.demo4_2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PersonAdvice {

//    @Pointcut("execution(* com.spring.study.demo4.demo4_2.Person.say(..))&& bean(woman)")
    @Pointcut("execution(* com.spring.study.demo4.demo4_2.Person.say(..))")
    public void doSay(){}

    @Pointcut("execution(String com.spring.study.demo4.demo4_2.Person.call(int, int)) && args(i, j)")
    public void doCall(int i, int j){}

    @Pointcut("execution(* com.spring.study.demo4.demo4_2.Person.handle(PersonVo)) && args(vo)")
    public void doHandle(PersonVo vo){}

    @Before("doSay()")
    public void doBefore(){
        System.out.println("say()方法执行之前");
    }

    @Before("doCall(i, j)")
    public void doBefore2(int i, int j){
        System.out.println("call()方法执行前置通知");
        System.out.println("前置通知获取到参数 : i = " + i + ", j = " + j);
    }

    @Before("doHandle(vo)")
    public void doBefore3(PersonVo vo){
        System.out.println("前置通知获取到vo对象， age = " + vo.getAge() + ", sex = " + vo.getSex());
    }
}
