package com.proyectocsi.api.rest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyectocsi.api.rest.models.entity.Rol;

public interface IRolDAO extends CrudRepository<Rol, Integer> {
	
}
