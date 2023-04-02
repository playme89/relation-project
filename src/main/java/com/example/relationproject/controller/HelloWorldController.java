package com.example.relationproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

    @GetMapping("/api/helloWorld")
    public String helloWorld(){
        return "HelloWorld";
    }
}


