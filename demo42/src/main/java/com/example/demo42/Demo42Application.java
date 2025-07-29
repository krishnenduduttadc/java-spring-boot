package com.example.demo42;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.demo42.entity.User;
import com.example.demo42.repository.UserRepository;

@SpringBootApplication
public class Demo42Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo42Application.class, args);
	}


	@Bean
    public CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User("Alice", 25));
            userRepository.save(new User("Bob", 30));
            userRepository.save(new User("Charlie", 35));
            userRepository.save(new User("David", 28));
        };
    }

}
