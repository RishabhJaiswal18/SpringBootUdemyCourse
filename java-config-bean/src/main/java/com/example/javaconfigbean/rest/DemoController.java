package com.example.javaconfigbean.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javaconfigbean.common.Coach;

@RestController
public class DemoController {

	private Coach myCoach;

//	default method name of bean
//	@Autowired
//	public DemoController(@Qualifier("swimCoach") Coach theCoach) {
//		System.out.println("In Constructor " + getClass().getSimpleName());
//		this.myCoach = theCoach;
//	}
	
//	custom name of bean 
	@Autowired
	public DemoController(@Qualifier("aquatic") Coach theCoach) {
		System.out.println("In Constructor " + getClass().getSimpleName());
		this.myCoach = theCoach;
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkouts() {
		return myCoach.getDailyWorkouts();
	}
}
