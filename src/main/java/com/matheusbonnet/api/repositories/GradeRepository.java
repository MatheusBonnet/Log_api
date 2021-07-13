package com.matheusbonnet.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusbonnet.api.entities.GradeCurricular;

public interface GradeRepository extends JpaRepository<GradeCurricular, Integer>{

}
