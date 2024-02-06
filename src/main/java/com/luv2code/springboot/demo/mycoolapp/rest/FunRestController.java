package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //set up rest controller
public class FunRestController {
    
    // expose "/" that return "Hello World"
    
    @GetMapping("/") //handle HTTP GET requests
    public String sayHello() {
        return "Hello World!";
    }
    
}
