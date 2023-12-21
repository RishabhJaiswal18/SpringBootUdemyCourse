package com.example.beanscopes.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
