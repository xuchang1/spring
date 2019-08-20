package com.spring.study.demo4.demo4_3;

import org.springframework.stereotype.Component;

@Component
public class Woman implements Person {
    public void say() {
        System.out.println("woman say()");
    }
}
