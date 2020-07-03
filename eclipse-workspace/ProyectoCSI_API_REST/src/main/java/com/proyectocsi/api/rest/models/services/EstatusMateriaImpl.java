package com.proyectocsi.api.rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectocsi.api.rest.models.dao.IEstatusMateriaDAO;
import com.proyectocsi.api.rest.models.entity.EstatusMateria;

@Service
public class EstatusMateriaImpl implements IEstatusMateriaService {
	
	@Autowired
	private IEstatusMateriaDAO estatusMateria;
	
	@Override
	public List<EstatusMateria> findAll() {
		// TODO Auto-generated method stub
		return (List<EstatusMateria>) estatusMateria.findAll();
	}
	
}
