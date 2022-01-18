package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String sayhello(){
        return name;

    }
}
