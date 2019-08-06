package com.spring.study.demo3.demo3_1;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring Profile注解的使用
 */
public class ProfileTest {

    @Test
    public void test1() {
        //要通过Environment设置ActiveProfiles，顾初始化时不能加载配置文件，通过register方法注册并刷新
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("woman");
        context.getEnvironment().setActiveProfiles("man");
        context.register(JavaConfig.class);
        context.refresh();

        Action action = (Action) context.getBean("action");
        action.doSomething();
    }
}
