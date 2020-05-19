package com.coursejava.projetomongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursejava.projetomongodb.domain.User;
import com.coursejava.projetomongodb.repositories.UserRepository;

@Service
public class UserService {
     
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
