package com.example.beanlifecyclemethods.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}

	// define our init methods
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("In doMyStartupStuff " + getClass().getSimpleName());
	}

	// define our destroy methods
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("In doMyCleanupStuff " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "Practice for 15 minutes daily !!!";
	}

}
