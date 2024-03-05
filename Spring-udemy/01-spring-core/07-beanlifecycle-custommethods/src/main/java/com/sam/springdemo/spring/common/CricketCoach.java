package com.sam.springdemo.spring.common;

import com.sam.springdemo.spring.common.coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component


public class CricketCoach implements coach {
public CricketCoach(){
    System.out.println("cricketcoach constructor:"+getClass().getSimpleName());
}
//define init and destroy methods
    @PostConstruct
    public void domystartstuff(){
    System.out.println("In domystartupstuff(): "+getClass().getSimpleName());
    }
    @PreDestroy
    public void domycleanupstuff(){
        System.out.println("In domycleanupstuff(): "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practice fast bowling !!!";
    }
}
