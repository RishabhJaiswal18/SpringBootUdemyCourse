package com.example.qualifiers1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qualifiers1.common.Coach;

@RestController
public class DemoController {

	private Coach myCoach;
	
	@Autowired
	public DemoController(Coach theCoach) {
		this.myCoach = theCoach;
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkouts() {
		return myCoach.getDailyWorkouts();
	}
}
