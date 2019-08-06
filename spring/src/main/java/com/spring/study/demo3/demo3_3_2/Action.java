package com.spring.study.demo3.demo3_3_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Action {

    @Autowired
    //自动装配时，使用Qualifier限定符，每个bean都有自己的默认限定符，逾期id是一样的，也可以手动配置其限定符。
    @Qualifier("woman")
    private Person person;

    public void doSomething() {
        person.say();
    }
}
