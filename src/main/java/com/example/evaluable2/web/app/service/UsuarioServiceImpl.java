package com.example.evaluable2.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.evaluable2.web.app.model.dao.IUsuarioDAO;
import com.example.evaluable2.web.app.model.entity.Usuario;


@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioDAO usuarioDao;

	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Transactional
	public void save(Usuario usuario) {
		usuarioDao.save(usuario);
	}

	@Transactional(readOnly = true)
	public Optional<Usuario> findOne(Long id) {
		return usuarioDao.findById(id);
	}

	@Transactional
	public void delete(Long id) {
		usuarioDao.deleteById(id);
	}

	
	
	

}
