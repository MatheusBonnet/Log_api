package com.matheusbonnet.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusbonnet.api.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
