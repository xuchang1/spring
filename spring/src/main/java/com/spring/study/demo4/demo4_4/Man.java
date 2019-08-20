package com.spring.study.demo4.demo4_4;

public class Man implements Person {
    public void say() {
        System.out.println("man say()");
    }

    public void call(PersonVo vo) {
        System.out.println("man call : age = " + vo.getAge() + ", name : " + vo.getName());
    }
}
