package com.sam.springdemo.spring.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements coach{

public BaseballCoach()
{
    System.out.println("baseball constructor:"+getClass().getSimpleName());
}
    @Override
    public String getDailyWorkout() {
        return "practice baseball";
    }
}
