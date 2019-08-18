package com.spring.study.demo4.demo4_1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        Action action = (Action)context.getBean("action");
        try {
            action.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
