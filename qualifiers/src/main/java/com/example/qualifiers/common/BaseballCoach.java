package com.example.qualifiers.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes in batting practice :)";
	}

}
