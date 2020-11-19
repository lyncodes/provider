package com.lyn.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${provider.name}")
    private String name;

    @Value("${server.port}")
    private String port;


    @GetMapping("/hello")
    public String hello() {
        System.out.println("some one call me");
        logger.info("here is the log");
        return "provider:" + name + " port: " + port;
    }
}
