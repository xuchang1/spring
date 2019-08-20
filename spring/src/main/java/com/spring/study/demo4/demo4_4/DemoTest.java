package com.spring.study.demo4.demo4_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    public static void main(String[] args) {
        PersonVo vo = new PersonVo();
        vo.setAge(18);
        vo.setName("小明");

        ApplicationContext context = new ClassPathXmlApplicationContext("demo4_4/democonfig.xml");
        Man man = (Man) context.getBean("man");
        man.say();

        man.call(vo);
    }
}
