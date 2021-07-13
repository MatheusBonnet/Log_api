package com.matheusbonnet.api.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matheusbonnet.api.entities.Curso;
import com.matheusbonnet.api.entities.DTO.CursoDTO;
import com.matheusbonnet.api.mapper.CursoMapper;
import com.matheusbonnet.api.services.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	
	@Autowired
	CursoService cursoService;
	
	@Autowired
	private CursoMapper mapper;
	
	@GetMapping
	public ResponseEntity<List<Curso>> getCursos() {
		List<Curso> list = cursoService.getCurso();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Curso> findById(@PathVariable Integer id){
		Curso curso = cursoService.findById(id);
		return ResponseEntity.ok().body(curso);
	}
	
	@GetMapping("/nome")
	public ResponseEntity<List<Curso>> findByNome(@RequestParam String nome){
		List<Curso> curso = cursoService.findByNome(nome);
		return ResponseEntity.ok().body(curso);
	}
	
	@PostMapping
	public ResponseEntity<Curso> saveCurso(@RequestBody CursoDTO dto) throws URISyntaxException{
		Curso novoCurso = cursoService.save(mapper.mapCursoDtoToCurso(dto));
		return ResponseEntity.created(new URI("/cursos/salvarCurso" + novoCurso.getId())).body(novoCurso);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Curso> updateCurso(@RequestBody CursoDTO dto, @PathVariable Integer id) throws URISyntaxException{
		Curso novo = mapper.mapCursoDtoToCurso(dto);
		novo.setId(id);
		cursoService.update(novo);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> deleteCurso(@PathVariable Integer id) throws URISyntaxException{
		cursoService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
