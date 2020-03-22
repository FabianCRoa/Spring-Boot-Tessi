package com.tessi.sena.repository;

import org.springframework.data.repository.CrudRepository;

import com.tessi.sena.entity.Usuario;

public interface UserRepository extends CrudRepository<Usuario, Integer> {

	
}
