package com.example.lazyinitialization.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lazyinitialization.common.Coach;

@RestController
public class DemoController {

	private Coach myCoach;
	
	@Autowired
	public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
		this.myCoach = theCoach;
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkouts() {
		return myCoach.getDailyWorkouts();
	}
}
