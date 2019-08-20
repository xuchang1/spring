package com.spring.study.demo4.demo4_3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PersonAspect {

    //value :  指定了哪种类型的bean要引入该接口。在本例中，也就是所有实现了Person的类型。(标记符号后面的加号表示的是
    // Person的所有实现子类，而不是Person本身)

    //defaultImpl : 指定了引入接口提供实现的类。我们使用的是一个PersonExtend实现子类。

    //personExtend : 标注的静态属性指明了要引入的接口。在这里，我们所引入的是PersonExtend接口。
    @DeclareParents(value = "com.spring.study.demo4.demo4_3.Person+", defaultImpl = DefaultPersonExtend.class)
    public static PersonExtend personExtend;
}
