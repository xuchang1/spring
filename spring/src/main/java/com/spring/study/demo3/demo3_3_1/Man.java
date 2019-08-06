package com.spring.study.demo3.demo3_3_1;

import org.springframework.stereotype.Component;

@Component
public class Man implements Person {
    public void say() {
        System.out.println("I am man");
    }
}
