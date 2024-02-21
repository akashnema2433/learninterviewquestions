package com.learn.learninterviewquestions.config;

import com.learn.learninterviewquestions.dto.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@Lazy
public class BeanConfig {

    @Bean
    public TestBean testBean(){
        System.out.println("Test Bean Loaded..");
        return new TestBean();
    }


}
