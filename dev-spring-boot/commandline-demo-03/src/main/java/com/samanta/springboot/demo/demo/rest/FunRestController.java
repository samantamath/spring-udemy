package com.samanta.springboot.demo.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${team.name}")
	String teamname;
    
    @Value("${coach.name}")
    String coachname;

    @GetMapping("/")
    String helloworld(){

        return "hello world!!";
    }
    @GetMapping("/demo")
    public String Hello()
    {
		return "Hello fellas!!!";
    	
    	
    }
    @GetMapping("/coach")
    public String coach() {
    	
		return "coach is" + coachname ;
    	
    }
}

