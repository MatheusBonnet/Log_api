package com.matheusbonnet.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.matheusbonnet.api.entities.Curso;
import com.matheusbonnet.api.repositories.CursoRepository;
import com.matheusbonnet.api.services.CursoService;

@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	CursoRepository cursoRepository;

	@Override
	public List<Curso> getCurso() {
		return cursoRepository.findAll() ;
	}

	@Override
	public Curso save(Curso curso) {
		curso.setId(null);
		return cursoRepository.save(curso);
	}

	@Override
	public Curso findById(Integer id) {
		Optional<Curso> curso = cursoRepository.findById(id);
		return curso.orElse(null);
	}

	@Override
	public List<Curso> findByNome(String nome) {
		return cursoRepository.findByNameContaining(nome);
	}

	@Override
	public void update(Curso curso) {
		Curso atual = this.findById(curso.getId());
		atual.setName(curso.getName());
		atual.setArea(curso.getArea());
		cursoRepository.save(atual);
	}

	@Override
	public void delete(Integer id) {
		cursoRepository.deleteById(id);
	}


}
