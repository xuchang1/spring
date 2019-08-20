package com.spring.study.demo4.demo4_3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Aspect 结合 DeclareParents 注解 : 为所有Person的实现类提供提供PersonExtend接口功能，默认的功能实现为通过defaultImpl指定。
 *
 * 即此时Person的实现类，即使Person的实例，也是PersonExtend的实例，PersonExtend的功能通过defaultImpl指定指定实现。
 */
public class DemoTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        Object man = context.getBean("man");
        System.out.println(man instanceof Person);
        System.out.println(man instanceof  PersonExtend);
        //这个man对象，为什么不是DefaultPersonExtend的实例？
        //TODO
        System.out.println(man instanceof  DefaultPersonExtend);
        System.out.println(man instanceof  PersonExtend2);

        /*DefaultPersonExtend man1 = (DefaultPersonExtend) man;
        man1.call();*/
        PersonExtend man1 = (PersonExtend) man;
        man1.call();

        Man man2 = (Man) man;
        man2.say();
    }
}
