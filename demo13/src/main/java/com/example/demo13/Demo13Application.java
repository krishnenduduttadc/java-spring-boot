package com.example.demo13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Demo13Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo13Application.class, args);
	}

}
