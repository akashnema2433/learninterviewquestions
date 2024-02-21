package com.learn.learninterviewquestions.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoaderImpl {
    public LazyLoaderImpl(){
        System.out.println("LazyLoaderImpl....");
    }
}
