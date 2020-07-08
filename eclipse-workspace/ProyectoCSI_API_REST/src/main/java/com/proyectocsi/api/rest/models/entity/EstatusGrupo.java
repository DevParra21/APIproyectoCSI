package com.proyectocsi.api.rest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EstatusGrupo implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 15, nullable = false)
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreEstatus() {
		return nombre;
	}
	public void setNombreEstatus(String nombreEstatus) {
		this.nombre = nombreEstatus;
	}
}
