package com.proyectocsi.api.rest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyectocsi.api.rest.models.entity.Grupo;

public interface IGrupoDAO extends CrudRepository<Grupo, Long> {

}
