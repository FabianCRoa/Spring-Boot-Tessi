package com.tessi.sena.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tessi.sena.entity.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer> {

}
