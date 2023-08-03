package com.example.evaluable2.web.app.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.evaluable2.web.app.model.entity.Usuario;
import com.example.evaluable2.web.app.service.IUsuarioService;




@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService servicio;

	@GetMapping("/listar")
	public String m2(Model model) {

		model.addAttribute("title", "Listado de usuarios");
		model.addAttribute("usuarios", servicio.findAll());
	
		
		return "usuario/listar";
	}

	@GetMapping("/form")
	public String crear(Map<String, Object> model) {
		model.put("titulo", "Formulario de usuario");
		model.put("usuario", new Usuario());

		return "usuario/form";

	}

	@PostMapping("/form")
	public String guardar(@Validated Usuario usuario, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de usuarios");
			return "usuario/form";
		}
		servicio.save(usuario);

		return "redirect:/usuario/listar";

	}

	@GetMapping("/form/{id}")
	public String actualizar(@PathVariable("id") Long id, Map<String, Object> model) {

		Optional<Usuario> usuario = null;
		if (id > 0) {
			usuario = servicio.findOne(id);
		} else {
			return "redirect:/usuario/listar";
		}
		model.put("usuario", usuario);
		model.put("titulo", "Editar usuario");
		return "usuario/form";

	}

	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Long id) {
		if (id > 0)
			servicio.delete(id);
		return "redirect:/usuario/listar";
	}
	
	
	
	

}
