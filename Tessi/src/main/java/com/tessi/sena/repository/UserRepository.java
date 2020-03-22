package com.tessi.sena.repository;

import com.tessi.sena.entity.Usuario;
//import java.util.Set;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Usuario, Integer>{
    
    //public Set<Usuario> finByUsuarioiduser(Integer iduser);
}
