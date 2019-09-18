package com.aws.test.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/say")
    public String sayHello(){
        return "no hello, payload success!!! jenkins test one!";
    }

}
