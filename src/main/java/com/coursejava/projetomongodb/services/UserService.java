package com.coursejava.projetomongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursejava.projetomongodb.domain.User;
import com.coursejava.projetomongodb.repositories.UserRepository;
import com.coursejava.projetomongodb.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
     
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
