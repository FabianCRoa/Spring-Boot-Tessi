package com.tessi.sena.controller;

<<<<<<< HEAD
=======
import com.tessi.sena.service.UsuarioService;
>>>>>>> branch 'master' of https://github.com/FabianCRoa/Spring-Boot-Tessi.git
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tessi.sena.service.UserService;

@Controller
public class UserController {
	
<<<<<<< HEAD
	@Autowired
	private UserService userService;
	
=======
        @Autowired
        UsuarioService usuarioService;
    
>>>>>>> branch 'master' of https://github.com/FabianCRoa/Spring-Boot-Tessi.git
	@GetMapping("/")
	public String index() {
		return "index";		
	}
	
	@GetMapping("/user")
	public String user(Model model) {
<<<<<<< HEAD
		model.addAttribute("userList", userService.getAllUsers());
=======
            model.addAttribute("userList", usuarioService.getAllUsuarios());
>>>>>>> branch 'master' of https://github.com/FabianCRoa/Spring-Boot-Tessi.git
		return "user/user-view";		
	}
	


}
