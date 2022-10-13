package com.learning.Professional_Project.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public HelloWorldService() {

    }

    public String hello() {
        return "HelloWorld";
    }
}
