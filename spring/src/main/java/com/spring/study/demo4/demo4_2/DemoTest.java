package com.spring.study.demo4.demo4_2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

    @Test
    public void test1(){
        PersonVo vo = new PersonVo();
        vo.setAge(18);
        vo.setSex(1);

        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        Man man = (Man) context.getBean("man");
        man.say();
        System.out.println(man.call(1, 2));
        man.handle(vo);

        Woman woman = (Woman) context.getBean("woman");
        woman.say();
        System.out.println(woman.call(1, 2));
    }
}
