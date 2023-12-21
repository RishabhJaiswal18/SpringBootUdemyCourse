package com.example.javaconfigbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.javaconfigbean.common.Coach;
import com.example.javaconfigbean.common.SwimCoach;

@Configuration
public class SportConfig {

//	Default bean name i.e. method
//	@Bean
//	public Coach swimCoach() {
//		return new SwimCoach();
//	}

//	custom bean name
	@Bean("aquatic")
	public Coach swimCoach() {
		return new SwimCoach();
	}
}
