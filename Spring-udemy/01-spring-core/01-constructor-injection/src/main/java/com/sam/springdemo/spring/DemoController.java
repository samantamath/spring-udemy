package com.sam.springdemo.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for dependency
    private coach mycoach;

    public DemoController(coach thecoach){
        mycoach=thecoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return mycoach.getDailyWorkout();
    }

}
