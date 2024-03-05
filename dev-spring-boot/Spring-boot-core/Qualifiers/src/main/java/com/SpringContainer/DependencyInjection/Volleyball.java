package com.SpringContainer.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Volleyball implements Coach {

	@Override
	public String getDailyWorkout() {
		return"practice volleyball!!!";
	}

}
