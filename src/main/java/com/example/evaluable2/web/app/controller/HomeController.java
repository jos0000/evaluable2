package com.example.evaluable2.web.app.controller;

import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String m2(Model model) {

		model.addAttribute("title", "La Biblioteca");

		return "home";

	}
}
