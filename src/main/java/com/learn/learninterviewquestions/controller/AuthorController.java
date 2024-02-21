package com.learn.learninterviewquestions.controller;

import com.learn.learninterviewquestions.dto.TestBean;
import com.learn.learninterviewquestions.impl.LazyLoaderImpl;
import com.learn.learninterviewquestions.service.AuthorService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
//@Scope("prototype")
//@Scope("singleton")//by-default
public class AuthorController {

    public AuthorController() {
        System.out.println("Bean scope loaded.."+hashCode());
    }

    @Autowired
//    @Qualifier("authorServiceImpl1")
    @Resource(name = "${serviceProvider}")
    private AuthorService authorSerice;

    @Value("${this.is.prod}")
    private String productionFile;
    @Autowired
    private TestBean testBean;
//    @Autowired
//    private LazyLoaderImpl lazyLoader;

    @GetMapping("/saveAuthor")
    public String getSaveAuthor(){
        return authorSerice.saveAuthor();
    }

//    @GetMapping("/testBean")
//    public String testbeanHere(){
//        return testBean.method1();
//    }


    @GetMapping("/getDataPropertiesFile")
    @Profile("prod")
    public String getProductionFile(){
        return "this data Load from "+productionFile;
    }


}
