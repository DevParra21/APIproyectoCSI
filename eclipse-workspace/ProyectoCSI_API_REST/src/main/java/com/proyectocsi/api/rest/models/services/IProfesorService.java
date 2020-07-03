package com.proyectocsi.api.rest.models.services;

import java.util.List;

import com.proyectocsi.api.rest.models.entity.Profesor;

public interface IProfesorService {
	public List<Profesor> findAll();
	
	public Profesor findById(Long id);
	
	public Profesor save(Profesor profesor);
	
	public void delete(Long id);
}
