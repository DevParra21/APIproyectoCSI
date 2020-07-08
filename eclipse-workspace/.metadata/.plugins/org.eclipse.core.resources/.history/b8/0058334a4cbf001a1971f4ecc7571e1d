package com.proyectocsi.api.rest.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Alumno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/*
	 * 
	 */
	@Id
	@Column(length = 7, insertable = true, nullable = false, unique = true)
	private Long matricula;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setId(Usuario usuario) {
		this.usuario = usuario;
	}
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
}
