
package com.tessi.sena.service;

import org.springframework.stereotype.Service;
import com.tessi.sena.entity.Usuario;
import com.tessi.sena.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    UserRepository repository;
    
 //   @Override
 //   public Iterable<Usuario> getAllUsuarios() {
//        return repository.finByUsuarioiduser(Integer.SIZE);
//        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    @Override
    public Iterable<Usuario> getAllUsuarios() {
        return repository.findAll();
        
    }
    }

  

