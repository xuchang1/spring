package com.spring.study.demo3.demo3_3_3;

import org.springframework.stereotype.Component;

@Component
//@BigPerson
public class Man implements Person {
    public void say() {
        System.out.println("I am man");
    }
}
