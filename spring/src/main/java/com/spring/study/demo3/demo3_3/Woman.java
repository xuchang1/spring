package com.spring.study.demo3.demo3_3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Woman implements Person {
    public void say() {
        System.out.println("I am woman");
    }
}
