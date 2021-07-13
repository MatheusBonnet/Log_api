package com.matheusbonnet.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.matheusbonnet.api.entities.Curso;
import com.matheusbonnet.api.repositories.CursoRepository;

@Component
@Profile(value = "test")
public class TestDataBase implements CommandLineRunner{
	
	@Autowired
	CursoRepository cursoRepository;

	@Override
	public void run(String... args) throws Exception {
		

		Curso curso1 = new Curso("Curso de HTML", "Exatas");
		Curso curso2 = new Curso("Curso de CSS", "Exatas");
		Curso curso3 = new Curso("Curso de Medicina", "Humanas");
		
		cursoRepository.save(curso1);
		cursoRepository.save(curso2);
		cursoRepository.save(curso3);
		
	}

}
