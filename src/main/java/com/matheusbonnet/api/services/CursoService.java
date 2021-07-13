package com.matheusbonnet.api.services;

import java.util.List;

import com.matheusbonnet.api.entities.Curso;

public interface CursoService {

	public List<Curso> getCurso();
	
	public Curso save(Curso curso);
	
	public Curso findById(Integer id);
	
	public List<Curso> findByNome(String nome);
	
	public void update(Curso curso);
	
	public void delete(Integer id);
 }
