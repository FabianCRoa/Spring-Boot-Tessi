package com.tessi.sena.controller;

import com.tessi.sena.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
        @Autowired
        UsuarioService usuarioService;
    
	@GetMapping("/")
	public String index() {
		return "index";		
	}
	
	@GetMapping("/user")
	public String user(Model model) {
            model.addAttribute("userList", usuarioService.getAllUsuarios());
		return "user/user-view";		
	}

}
