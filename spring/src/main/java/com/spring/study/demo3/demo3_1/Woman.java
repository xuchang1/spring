package com.spring.study.demo3.demo3_1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("woman")
public class Woman implements Person {
    public void say() {
        System.out.println("I am woman");
    }
}
