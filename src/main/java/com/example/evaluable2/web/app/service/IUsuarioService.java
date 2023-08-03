package com.example.evaluable2.web.app.service;

import java.util.List;
import java.util.Optional;
import com.example.evaluable2.web.app.service.IUsuarioService;

import com.example.evaluable2.web.app.model.entity.Usuario;


public interface IUsuarioService {
	
	List<Usuario> findAll();

	void save(Usuario usuario);

	Optional<Usuario> findOne(Long id);

	void delete(Long id);


}
