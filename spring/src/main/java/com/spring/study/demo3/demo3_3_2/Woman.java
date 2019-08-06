package com.spring.study.demo3.demo3_3_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("woman1")
public class Woman implements Person {
    public void say() {
        System.out.println("I am woman");
    }
}
