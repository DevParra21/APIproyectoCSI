package com.proyectocsi.api.rest.models.services;

import java.util.List;

import com.proyectocsi.api.rest.models.entity.EstatusMateria;

public interface IEstatusMateriaService {
	
	public List<EstatusMateria> findAll();
}
