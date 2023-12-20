package com.example.qualifiers1.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

}
