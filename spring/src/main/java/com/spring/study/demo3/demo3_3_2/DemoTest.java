package com.spring.study.demo3.demo3_3_2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring Primary注解的使用
 */
public class DemoTest {

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Action action = (Action) context.getBean("action");
        action.doSomething();
    }
}
