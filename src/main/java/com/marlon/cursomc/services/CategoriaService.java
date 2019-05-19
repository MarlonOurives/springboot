package com.marlon.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlon.cursomc.domain.Categoria;
import com.marlon.cursomc.repositories.CategoriaRepository;
import java.util.Optional;

@Service
public class CategoriaService {

	//===Realiza Busca na categoria pelo Id===// 
	@Autowired
	private CategoriaRepository repo;
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
}
