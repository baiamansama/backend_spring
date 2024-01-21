package com.backend_spring.myFirstApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // here we expose '/' to return "Hello World!"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
