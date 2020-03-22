package com.tessi.sena.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tessi.sena.entity.Usuario;
import com.tessi.sena.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository; 
	
	@Override
	public Iterable<Usuario> getAllUsers() {
		return repository.findAll();
	}

	
}
