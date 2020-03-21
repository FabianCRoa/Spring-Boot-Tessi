
package com.tessi.sena.repository;

import com.tessi.sena.entity.Rol;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author felipe
 */
@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {
    
}
