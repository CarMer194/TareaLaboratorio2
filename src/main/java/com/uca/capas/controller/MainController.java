package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "login";
	}
	//nombre: hola
	//Contraseña: mundo
	@PostMapping("/validacion")
	public String procesarValidacion(Usuario usuario) {
		if(usuario.getNombre().equals("hola") && usuario.getContrasena().equals("mundo")) {
			return "mostrarExito";
		}else {
			return "mostrarFallo";
		}
		
	}
	
	@PostMapping("/login")
	public String procesarForm(Usuario usuario) {
		return "mostrarMensaje";
	}
	
}
