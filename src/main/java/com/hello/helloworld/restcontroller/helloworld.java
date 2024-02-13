package com.hello.helloworld.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

    @GetMapping(value = "/hello")
    public String helloworld() {

        return "hello world";
    }
    
}
