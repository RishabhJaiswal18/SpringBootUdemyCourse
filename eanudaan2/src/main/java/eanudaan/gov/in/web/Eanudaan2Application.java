package eanudaan.gov.in.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Eanudaan2Application {

	public static void main(String[] args) {
		SpringApplication.run(Eanudaan2Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("#### Server Started ####");
		};
	}

}
