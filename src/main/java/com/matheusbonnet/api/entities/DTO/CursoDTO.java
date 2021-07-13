package com.matheusbonnet.api.entities.DTO;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class CursoDTO implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotNull
	private String name;	
	
	@NotNull
	private String area;
	
	public CursoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CursoDTO(String name, String area) {
		super();
		this.name = name;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}
