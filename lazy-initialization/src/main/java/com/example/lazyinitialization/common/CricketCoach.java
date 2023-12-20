package com.example.lazyinitialization.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "Practice for 15 minutes daily !!!";
	}

}
