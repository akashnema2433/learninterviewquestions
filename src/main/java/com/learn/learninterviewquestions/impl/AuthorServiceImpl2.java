package com.learn.learninterviewquestions.impl;

import com.learn.learninterviewquestions.service.AuthorService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class AuthorServiceImpl2 implements AuthorService {
    @Override
    public String saveAuthor() {
        return "this is author 2 implementation";
    }
}
