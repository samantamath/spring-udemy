package com.example.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	//CommandLineRunner is from spring boot, will be executed after all beans have been loaded
	public CommandLineRunner commandLineRunner(String[] args) {
		//this is a Java lambda expression, a shortcut notation for providing an implementation of CommandLineRunner interface.
		return runner -> {
			System.out.println("this is a Java lambda expression, a shortcut notation for providing an implementation of CommandLineRunner interface.");
		};
	}

}
