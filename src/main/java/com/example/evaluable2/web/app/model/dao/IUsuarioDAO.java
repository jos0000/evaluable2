package com.example.evaluable2.web.app.model.dao;

import org.springframework.data.repository.CrudRepository;


import com.example.evaluable2.web.app.model.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{

}
