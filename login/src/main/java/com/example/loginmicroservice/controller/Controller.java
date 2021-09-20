package com.example.loginmicroservice.controller;



import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Controller {
    @GetMapping("/")
    public String display(){
        return "Hello World";
    }
    @GetMapping("/success")
    public String loggedIn(){
        return "Logged in successfully";
    }
    @GetMapping("/fail")
    public String error(){
        return "Incorrect Credentials";
    }
}
