package com.proyectocsi.api.rest.models.services;

import java.util.List;

import com.proyectocsi.api.rest.models.entity.EstatusUsuario;

public interface IEstatusUsuarioService {
	
	public List<EstatusUsuario> findAll();
}
