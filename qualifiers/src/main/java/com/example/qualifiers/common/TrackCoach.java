package com.example.qualifiers.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "Run a hard 5 km";
	}

}
