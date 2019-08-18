package com.spring.study.demo4.demo4_1;

import org.springframework.stereotype.Component;

@Component
public class Action {
    public void doSomething() throws Exception {
        try {
            System.out.println("doSomething");
            throw new NullPointerException("空指针异常");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
