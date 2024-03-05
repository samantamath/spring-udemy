package com.samanta.springboot.demo.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @GetMapping("/")
    String helloworld(){

        return "hello world!!";
    }
}
