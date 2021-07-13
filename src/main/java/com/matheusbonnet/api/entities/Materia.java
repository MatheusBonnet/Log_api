package com.matheusbonnet.api.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@ManyToMany
	@JoinTable(name = "grade_materia", joinColumns = {@JoinColumn(name = "materia_id", referencedColumnName = "id")}, 
	inverseJoinColumns = {@JoinColumn(name = "grade_id", referencedColumnName = "id")})
	private Set<GradeCurricular> grades = new HashSet<GradeCurricular>();

	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(String name, Set<GradeCurricular> grades) {
		super();
		this.name = name;
		this.grades = grades;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<GradeCurricular> getGrades() {
		return grades;
	}

	public void setGrades(Set<GradeCurricular> grades) {
		this.grades = grades;
	}
}
