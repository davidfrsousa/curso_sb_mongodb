package com.example.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.domain.User;
import com.example.curso.dto.UserDTO;
import com.example.curso.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> lista = userService.findAll();
		List<UserDTO> listaDto = lista.stream().map(x -> new UserDTO(x)).toList();
		return ResponseEntity.ok().body(listaDto);
	}
}
