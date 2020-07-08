package com.proyectocsi.api.rest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Materia implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "clave_materia", length = 3, nullable = false, unique = true)
	private String claveMateria;
	
	@Column(name = "nombre_materia", length = 50, nullable = false)
	private String nombreMateria;

	@ManyToOne
	private EstatusMateria estatusMateria;

	@Column(name = "fecha_alta")
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;

	@ManyToOne
	private Usuario usuarioAlta;

	@Column(name = "fecha_ultima_modificacion")
	@Temporal(TemporalType.DATE)
	private Date fechaUltimaModificacion;

	@ManyToOne
	private Usuario usuarioUltimaModificacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClaveMateria() {
		return claveMateria;
	}

	public void setClaveMateria(String claveMateria) {
		this.claveMateria = claveMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public EstatusMateria getEstatusMateria() {
		return estatusMateria;
	}

	public void setEstatusMateria(EstatusMateria estatusMateria) {
		this.estatusMateria = estatusMateria;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Usuario getUsuarioAlta() {
		return usuarioAlta;
	}

	public void setUsuarioAlta(Usuario usuarioAlta) {
		this.usuarioAlta = usuarioAlta;
	}

	public Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}

	public Usuario getUsuarioUltimaModificacion() {
		return usuarioUltimaModificacion;
	}

	public void setUsuarioUltimaModificacion(Usuario usuarioUltimaModificacion) {
		this.usuarioUltimaModificacion = usuarioUltimaModificacion;
	}

}
