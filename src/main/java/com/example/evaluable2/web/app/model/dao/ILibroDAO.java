package com.example.evaluable2.web.app.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.evaluable2.web.app.model.entity.Libro;

public interface ILibroDAO extends PagingAndSortingRepository<Libro, Long>, CrudRepository <Libro, Long> {

}
