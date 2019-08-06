package com.spring.study.demo3.demo3_3_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Action {

    @Autowired
    @Qualifier
    private Person person;

    public void doSomething() {
        person.say();
    }
}
