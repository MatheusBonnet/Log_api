package com.matheusbonnet.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusbonnet.api.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{
	
	List<Curso> findByNameContaining(String name);
	
	
	
}
