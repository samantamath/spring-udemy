package com.sam.springdemo.spring.common;

import com.sam.springdemo.spring.common.coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component
//@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class CricketCoach implements coach {
public CricketCoach(){
    System.out.println("cricketcoach constructor:"+getClass().getSimpleName());
}

    @Override
    public String getDailyWorkout() {
        return "practice fast bowling !!!";
    }
}
