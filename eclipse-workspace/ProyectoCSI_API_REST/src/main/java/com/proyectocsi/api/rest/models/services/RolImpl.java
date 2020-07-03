package com.proyectocsi.api.rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectocsi.api.rest.models.dao.IRolDAO;
import com.proyectocsi.api.rest.models.entity.Rol;

@Service
public class RolImpl implements IRolService {
	
	@Autowired
	private IRolDAO rolDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Rol> findAll()
	{
		return (List<Rol>)rolDao.findAll();
	}
}
