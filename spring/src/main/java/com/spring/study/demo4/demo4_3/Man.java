package com.spring.study.demo4.demo4_3;

import org.springframework.stereotype.Component;

@Component
public class Man implements Person {
    public void say() {
        System.out.println("man say()");
    }
}
