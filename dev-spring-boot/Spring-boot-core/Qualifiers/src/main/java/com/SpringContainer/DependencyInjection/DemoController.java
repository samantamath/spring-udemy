package com.SpringContainer.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	private Coach myCoach;
	@Autowired
	public DemoController(@Qualifier("volleyball")Coach theCoach) {
		myCoach=theCoach;
		
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout()
	{
		return myCoach.getDailyWorkout();
		
	}
}


