package com.example.radical;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hotel {
    @GetMapping("/hotel")
    public String getData(){
        return "Book your stay with us!!!!!";
    }

}
