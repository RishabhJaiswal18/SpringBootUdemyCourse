package com.example.qualifiers.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "Practice for 15 minutes daily !!!";
	}

}
