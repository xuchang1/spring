package com.spring.study.demo4.demo4_2;

import org.springframework.stereotype.Component;

@Component
public class Man implements Person {
    public void say() {
        System.out.println("man say()");
    }

    public String call(int i, int j) {
        return i + j + "";
    }

    public void handle(PersonVo vo) {
        System.out.println("man handle()");
    }
}
