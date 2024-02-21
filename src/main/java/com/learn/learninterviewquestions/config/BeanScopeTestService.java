package com.learn.learninterviewquestions.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope("singleton")//by-default
public class BeanScopeTestService {
    public BeanScopeTestService() {
        System.out.println("BeanScopeTestService Loaded......");
    }
}
