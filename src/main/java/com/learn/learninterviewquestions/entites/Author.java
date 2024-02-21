package com.learn.learninterviewquestions.entites;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Author {
    private String name;
    private String city;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    private Date joiningDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
