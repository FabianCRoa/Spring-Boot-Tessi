<<<<<<< HEAD
package com.tessi.sena.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tessi.sena.entity.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer> {

=======

package com.tessi.sena.repository;

import com.tessi.sena.entity.Rol;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {
    
>>>>>>> branch 'master' of https://github.com/FabianCRoa/Spring-Boot-Tessi.git
}
