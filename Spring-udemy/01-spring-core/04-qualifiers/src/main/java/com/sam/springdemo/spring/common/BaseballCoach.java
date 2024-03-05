package com.sam.springdemo.spring.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements coach{


    @Override
    public String getDailyWorkout() {
        return "practice baseball";
    }
}
