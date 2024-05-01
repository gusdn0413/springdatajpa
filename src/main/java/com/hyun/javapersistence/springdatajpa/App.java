package com.hyun.javapersistence.springdatajpa;

import com.hyun.javapersistence.springdatajpa.model.User;
import com.hyun.javapersistence.springdatajpa.repositories.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}{

	}

	@Bean
	public ApplicationRunner configure(UserRepository userRepository) {
		return env ->
		{
		};
	}
}
