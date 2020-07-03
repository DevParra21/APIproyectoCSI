package com.proyectocsi.api.rest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyectocsi.api.rest.models.entity.Materia;

public interface IMateriaDAO extends CrudRepository<Materia, Long> {

}
