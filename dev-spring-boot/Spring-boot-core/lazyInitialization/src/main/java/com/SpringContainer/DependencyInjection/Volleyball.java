package com.SpringContainer.DependencyInjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Volleyball implements Coach {
	public Volleyball() {
		System.out.println("In constructor:"+getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "practice volleyball!!!";
	}

}
