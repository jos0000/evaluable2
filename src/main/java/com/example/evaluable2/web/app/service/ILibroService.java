package com.example.evaluable2.web.app.service;

import java.util.List;

import com.example.evaluable2.web.app.service.ILibroService;



import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.evaluable2.web.app.model.entity.Libro;

public interface ILibroService {

	List<Libro> findAll();
	Page<Libro> listar(Pageable pageable);

	void save(Libro libro);

	Optional<Libro> findOne(Long id);

	void delete(Long id);

}
