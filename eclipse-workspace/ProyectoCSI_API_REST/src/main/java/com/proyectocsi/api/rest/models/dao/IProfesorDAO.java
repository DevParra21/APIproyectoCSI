package com.proyectocsi.api.rest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyectocsi.api.rest.models.entity.Profesor;

public interface IProfesorDAO extends CrudRepository<Profesor, Long> {

}
