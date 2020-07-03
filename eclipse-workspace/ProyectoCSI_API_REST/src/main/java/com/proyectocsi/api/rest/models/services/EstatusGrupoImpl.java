package com.proyectocsi.api.rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectocsi.api.rest.models.dao.IEstatusGrupoDAO;
import com.proyectocsi.api.rest.models.entity.EstatusGrupo;

@Service
public class EstatusGrupoImpl implements IEstatusGrupoService {
	
	@Autowired
	private IEstatusGrupoDAO estatusGrupo;

	@Override
	public List<EstatusGrupo> findAll() {
		// TODO Auto-generated method stub
		return (List<EstatusGrupo>) estatusGrupo.findAll();
	}
}
