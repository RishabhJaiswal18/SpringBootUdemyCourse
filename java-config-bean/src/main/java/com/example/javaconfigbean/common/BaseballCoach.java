package com.example.javaconfigbean.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	public BaseballCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes in batting practice :)";
	}

}
