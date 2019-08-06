package com.spring.study.demo3.demo3_2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        if (context.containsBean("man")) {
            System.out.println("容器中包含该bean");
        } else {
            System.out.println("容器中不包含该bean");
        }
    }
}
