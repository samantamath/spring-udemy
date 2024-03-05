package com.sam.springdemo.spring.common;

import com.sam.springdemo.spring.common.coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements coach {


    @Override
    public String getDailyWorkout() {
        return "practice fast bowling !!!";
    }
}
