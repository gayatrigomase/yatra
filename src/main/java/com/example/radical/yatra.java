package com.example.radical;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class yatra {
    @GetMapping("/yatra")
    public String getData(){
        return "Welcome to yatra.com Please book your ticket";
    }

}