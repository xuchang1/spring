package com.spring.study.demo4.demo4_3;

import org.springframework.stereotype.Component;

@Component
public class DefaultPersonExtend implements PersonExtend {
    public void call() {
        System.out.println("DefaultPersonExtend call()");
    }
}
