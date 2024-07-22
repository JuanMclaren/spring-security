package com.pradeep.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/user")
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/")
    public String get(){
        return "Hello";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "Hello Admin";
    }

    @GetMapping("/all")
    public String getAll(){
        return "Hello All";
    }
}
