package com.example.evaluable2.web.app.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.evaluable2.web.app.model.entity.Usuario;

public interface IUsuarioDAO extends PagingAndSortingRepository<Usuario, Long>, CrudRepository<Usuario, Long>{

}
