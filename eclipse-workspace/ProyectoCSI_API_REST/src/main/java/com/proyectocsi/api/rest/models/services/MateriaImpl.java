package com.proyectocsi.api.rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectocsi.api.rest.models.dao.IMateriaDAO;
import com.proyectocsi.api.rest.models.entity.Materia;

@Service
public class MateriaImpl implements IMateriaService {
	
	@Autowired
	private IMateriaDAO materiaDao;
	
	@Override
	public List<Materia> findAll() {
		// TODO Auto-generated method stub
		return (List<Materia>) materiaDao.findAll();
	}

	@Override
	public Materia findById(Long id) {
		// TODO Auto-generated method stub
		return materiaDao.findById(id).orElse(null);
	}

	@Override
	public Materia save(Materia materia) {
		// TODO Auto-generated method stub
		return materiaDao.save(materia);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		materiaDao.deleteById(id);
	}

}
