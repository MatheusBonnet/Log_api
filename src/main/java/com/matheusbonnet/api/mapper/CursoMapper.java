package com.matheusbonnet.api.mapper;

import org.springframework.stereotype.Service;

import com.matheusbonnet.api.entities.Curso;
import com.matheusbonnet.api.entities.DTO.CursoDTO;

@Service
public class CursoMapper {

	public Curso mapCursoDtoToCurso(CursoDTO dto) {
		Curso curso = new Curso(dto.getName(), dto.getArea());
		return curso;
		
	}
}
