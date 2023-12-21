package com.example.javaconfigbean.common;

public class SwimCoach implements Coach {

	public SwimCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "Swim 1000 meters as a warm up";
	}

}
