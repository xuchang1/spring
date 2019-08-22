package com.spring.study.demo4.demo4_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo4_5/config.xml");
        Object man = context.getBean("man");
        System.out.println(man instanceof Man);
        System.out.println(man instanceof PersonExtend);
        System.out.println(man instanceof DefaultPersonExtend);

        Man man1 = (Man) man;
        man1.say();

        PersonExtend man2 = (PersonExtend) man;
        //强制转化报错，man不是DefaultPersonExtend的实例
//        PersonExtend man2 = (DefaultPersonExtend) man;
        System.out.println(man2.call(1));
    }
}
