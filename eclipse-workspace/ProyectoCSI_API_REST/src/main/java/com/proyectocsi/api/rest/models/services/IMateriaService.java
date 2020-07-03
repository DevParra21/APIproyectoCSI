package com.proyectocsi.api.rest.models.services;

import java.util.List;

import com.proyectocsi.api.rest.models.entity.Materia;

public interface IMateriaService {
	public List<Materia> findAll();
	
	public Materia findById(Long id);
	
	public Materia save(Materia materia);
	
	public void delete(Long id);
}
