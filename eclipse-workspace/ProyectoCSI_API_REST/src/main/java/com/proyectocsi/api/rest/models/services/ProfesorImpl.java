package com.proyectocsi.api.rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectocsi.api.rest.models.dao.IProfesorDAO;
import com.proyectocsi.api.rest.models.entity.Profesor;

@Service
public class ProfesorImpl implements IProfesorService{

	@Autowired
	private IProfesorDAO profesorDao;
	
	@Override
	public List<Profesor> findAll() {
		// TODO Auto-generated method stub
		return (List<Profesor>) profesorDao.findAll();
	}

	@Override
	public Profesor findById(Long id) {
		// TODO Auto-generated method stub
		return profesorDao.findById(id).orElse(null);
	}

	@Override
	public Profesor save(Profesor profesor) {
		// TODO Auto-generated method stub
		return profesorDao.save(profesor);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		profesorDao.deleteById(id);
	}
	
	
	
}
