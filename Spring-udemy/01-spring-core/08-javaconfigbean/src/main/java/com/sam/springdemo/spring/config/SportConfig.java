package com.sam.springdemo.spring.config;

import com.sam.springdemo.spring.common.SwimCoach;
//import com.sam.springdemo.spring.common.Coach;
import com.sam.springdemo.spring.common.coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public coach swimCoach()
    {
        return new SwimCoach();
    }
}
