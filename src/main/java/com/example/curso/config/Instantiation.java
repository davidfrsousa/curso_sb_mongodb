package com.example.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.curso.domain.User;
import com.example.curso.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();

		User david = new User(null, "David Ferreira", "david@gmail.com");
		User taina = new User(null, "Taina Alexandria", "taina@gmail.com");
		User victoria = new User(null, "Victoria Gama", "victoria@gmail.com");

		userRepository.saveAll(Arrays.asList(david, taina, victoria));

	}

}
