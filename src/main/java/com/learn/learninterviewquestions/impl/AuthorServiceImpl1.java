package com.learn.learninterviewquestions.impl;

import com.learn.learninterviewquestions.service.AuthorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AuthorServiceImpl1 implements AuthorService {

    Logger logger=LoggerFactory.getLogger(AuthorServiceImpl1.class);

    @Override
    public String saveAuthor() {
        return "Author save method";
    }

    @Scheduled(fixedRate = 5000)
    public void jobScheduler(){
        System.out.println("JOb Scheduler run ------"+new Date().toString());
        logger.info("started....");
    }
}
