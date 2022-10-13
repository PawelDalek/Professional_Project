package com.learning.Professional_Project.controller;

import com.learning.Professional_Project.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloWorldController {

    private  HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("hello")
    public String test() {
        log.info("GET /hello");
        return helloWorldService.hello();
    }
}
