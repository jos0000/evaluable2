package com.example.evaluable2.web.app.service;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.evaluable2.web.app.model.dao.ILibroDAO;
import com.example.evaluable2.web.app.model.entity.Libro;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	private ILibroDAO libroDao;

	@Transactional(readOnly = true)
	public List<Libro> findAll() {
		return (List<Libro>) libroDao.findAll();
	}

	@Transactional
	public void save(Libro libro) {
		libroDao.save(libro);
	}

	@Transactional(readOnly = true)
	public Optional<Libro> findOne(Long id) {
		return libroDao.findById(id);
	}

	@Transactional
	public void delete(Long id) {
		libroDao.deleteById(id);
	}

}
