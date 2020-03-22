package com.tessi.sena.controller;


import com.tessi.sena.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tessi.sena.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	

        @Autowired
        UsuarioService usuarioService;
    
	@GetMapping("/")
	public String index() {
		return "index";		
	}
	
	@GetMapping("/user")
	public String user(Model model) {
		model.addAttribute("userList", userService.getAllUsers());
            model.addAttribute("userList", usuarioService.getAllUsuarios());
		return "user/user-view";		
	}
	


}
