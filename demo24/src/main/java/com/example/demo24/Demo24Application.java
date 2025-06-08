package com.example.demo24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class Demo24Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo24Application.class, args);
	}

}
