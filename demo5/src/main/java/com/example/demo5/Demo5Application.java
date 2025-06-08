package com.example.demo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Demo5Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo5Application.class, args);
	}

}
