<<<<<<< HEAD
package com.tessi.sena.repository;

import org.springframework.data.repository.CrudRepository;

import com.tessi.sena.entity.Usuario;

public interface UserRepository extends CrudRepository<Usuario, Integer> {

	
=======

package com.tessi.sena.repository;

import com.tessi.sena.entity.Usuario;
//import java.util.Set;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Usuario, Long>{
    
    //public Set<Usuario> finByUsuarioiduser(Integer iduser);
>>>>>>> branch 'master' of https://github.com/FabianCRoa/Spring-Boot-Tessi.git
}
