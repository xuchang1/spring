package com.spring.study.demo3.demo3_2;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(MatchCondition.class)
public class Man {

}
