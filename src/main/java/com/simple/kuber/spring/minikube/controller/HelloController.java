package com.simple.kuber.spring.minikube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    @GetMapping("/am-i-lucky")
    public String getHello() {
        return new Random().nextBoolean() ? "Yes" : "No, try again";
    }

}
