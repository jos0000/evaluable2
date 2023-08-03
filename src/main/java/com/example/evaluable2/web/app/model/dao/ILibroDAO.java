package com.example.evaluable2.web.app.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.evaluable2.web.app.model.entity.Libro;

public interface ILibroDAO extends CrudRepository<Libro, Long> {

}
