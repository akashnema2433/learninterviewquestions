package com.learn.learninterviewquestions;

import com.learn.learninterviewquestions.config.BeanScopeTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LearninterviewquestionsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearninterviewquestionsApplication.class, args);

		BeanScopeTestService testBean1 = context.getBean(BeanScopeTestService.class);
		BeanScopeTestService testBean2 = context.getBean(BeanScopeTestService.class);
		BeanScopeTestService testBean3 = context.getBean(BeanScopeTestService.class);




	}

}
