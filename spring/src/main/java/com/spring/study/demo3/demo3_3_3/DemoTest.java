package com.spring.study.demo3.demo3_3_3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring qualifier自定义注解的使用
 */
public class DemoTest {

    @org.junit.jupiter.api.Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Action action = (Action) context.getBean("action");
        action.doSomething();
    }
}
