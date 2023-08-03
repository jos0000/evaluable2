package com.example.evaluable2.web.app.service;

import java.util.List;
import com.example.evaluable2.web.app.service.ILibroService;



import java.util.Optional;

import com.example.evaluable2.web.app.model.entity.Libro;

public interface ILibroService {

	List<Libro> findAll();

	void save(Libro libro);

	Optional<Libro> findOne(Long id);

	void delete(Long id);

}
