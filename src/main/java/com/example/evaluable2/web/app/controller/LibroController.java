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
import com.example.evaluable2.web.app.service.ILibroService;
import com.example.evaluable2.web.app.model.entity.Libro;


@Controller
@RequestMapping("/libro")
public class LibroController {

	@Autowired
	private ILibroService servicio;

	@GetMapping("/listar")
	public String m2(Model model) {

		model.addAttribute("title", "Listado de libros");
		model.addAttribute("libros", servicio.findAll());
	
		
		return "libro/listar";
	}

	@GetMapping("/form")
	public String crear(Map<String, Object> model) {
		model.put("titulo", "Formulario de clientes");
		model.put("libro", new Libro());

		return "libro/form";

	}

	@PostMapping("/form")
	public String guardar(@Validated Libro libro, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de libros");
			return "libro/form";
		}
		servicio.save(libro);

		return "redirect:/libro/listar";

	}

	@GetMapping("/form/{id}")
	public String actualizar(@PathVariable("id") Long id, Map<String, Object> model) {

		Optional<Libro> libro = null;
		if (id > 0) {
			libro = servicio.findOne(id);
		} else {
			return "redirect:/libro/listar";
		}
		model.put("libro", libro);
		model.put("titulo", "Editar libro");
		return "libro/form";

	}

	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Long id) {
		if (id > 0)
			servicio.delete(id);
		return "redirect:/libro/listar";
	}

}
