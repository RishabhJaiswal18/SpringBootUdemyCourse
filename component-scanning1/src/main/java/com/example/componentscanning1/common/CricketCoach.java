package com.example.componentscanning1.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Fast Bowling for 15 minutes !!!!";
	}

}
