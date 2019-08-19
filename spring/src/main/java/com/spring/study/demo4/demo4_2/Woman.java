package com.spring.study.demo4.demo4_2;

import org.springframework.stereotype.Component;

@Component
public class Woman implements Person {
    public void say() {
        System.out.println("woman say()");
    }

    public String call(int i, int j) {
        return (i + j + "1");
    }

    public void handle(PersonVo vo) {
        System.out.println("woman handle()");
    }
}
