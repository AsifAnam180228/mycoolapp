package com.asif.anam.mycoolapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //excopse "/" that return "Hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

}
