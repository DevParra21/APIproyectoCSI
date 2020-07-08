package com.proyectocsi.api.rest.models.services;

import java.util.List;

import com.proyectocsi.api.rest.models.entity.Grupo;
import com.proyectocsi.api.rest.models.entity.Materia;

public interface IGrupoService {
	public List<Grupo> findAll();
	
	public Grupo findById(Long id);
	
	public Grupo save(Grupo grupo);
	
	public void delete(Long id);
	
	public List<Materia> findAllMateria();
}
