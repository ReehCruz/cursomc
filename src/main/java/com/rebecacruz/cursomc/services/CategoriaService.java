package com.rebecacruz.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rebecacruz.cursomc.domain.Categoria;
import com.rebecacruz.cursomc.repositories.CategoriaRepository;
import com.rebecacruz.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {	
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}
	
}
