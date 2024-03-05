package com.sam.springdemo.spring.rest;

import com.sam.springdemo.spring.common.coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for dependency
    private coach mycoach1;



//@Autowired
//public DemoController(@Qualifier ("cricketCoach") coach theCoach1){
//    mycoach1=theCoach1;
//}

@Autowired
public DemoController(@Qualifier("swimCoach")coach theCoach1) {
    System.out.println("constructor: "+ getClass().getSimpleName());
    mycoach1=theCoach1;

}

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return mycoach1.getDailyWorkout();
    }

}
