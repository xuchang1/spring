package com.spring.study.demo3.demo3_1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("man")
public class Man implements Person{
    public void say() {
        System.out.println("I am man");
    }
}
