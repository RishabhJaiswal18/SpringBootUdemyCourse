package com.example.beanscopes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beanscopes.common.Coach;

@RestController
public class DemoController {

	private Coach myCoach;

	private Coach anotherCoach;

	@Autowired
	public DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach) {
		this.myCoach = theCoach;
		this.anotherCoach = theAnotherCoach;
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkouts() {
		return myCoach.getDailyWorkouts();
	}

	@GetMapping("/check")
	public String check() {
		return "Comparing Beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
	}
}
