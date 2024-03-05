package com.sam.springdemo.spring.common;

public class SwimCoach implements coach {
public SwimCoach(){
    System.out.println("Constructor"+getClass().getSimpleName());
}

    @Override
    public String getDailyWorkout() {
        return "swim swim swim!!!!";
    }
}
