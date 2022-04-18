package com.example.curso.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User david = new User("1", "David Ferreira", "david@hotmail.com");
		User taina = new User("2", "Taina Alexandria", "taina@hotmail.com");
		List<User> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(david,taina));
		return ResponseEntity.ok().body(lista);
	}
}
