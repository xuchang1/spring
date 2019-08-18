package com.spring.study.demo4.demo4_1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.spring.study.demo4.demo4_1")
//启动AspectJ的自动代理
@EnableAspectJAutoProxy
public class DemoConfig {
}
