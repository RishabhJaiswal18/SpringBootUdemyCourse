package com.example.javaconfigbean.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	public TrackCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "Run a hard 5 km";
	}

}
