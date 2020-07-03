package com.proyectocsi.api.rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectocsi.api.rest.models.dao.ITipoProfesorDAO;
import com.proyectocsi.api.rest.models.entity.TipoProfesor;

@Service
public class TipoProfesorImpl implements ITipoProfesorService {
	
	@Autowired
	private ITipoProfesorDAO tipoProfesor;
	
	@Override
	public List<TipoProfesor> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoProfesor>) tipoProfesor.findAll();
	}
	
}
