package com.coursejava.projetomongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursejava.projetomongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
	     User user = new User("1" , "Maria Silva", "maria@gmail.com");
	     User user1 = new User("2" , "Alex Santos", "alex@gmail.com");
	     
	     List<User> users = new ArrayList<>();
	     users.addAll(Arrays.asList(user, user1));
	     return ResponseEntity.ok().body(users);
	}
}
