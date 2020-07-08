package com.proyectocsi.api.rest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.proyectocsi.api.rest.models.entity.Grupo;
import com.proyectocsi.api.rest.models.entity.Materia;

public interface IGrupoDAO extends CrudRepository<Grupo, Long> {
	
	@Query("SELECT m FROM Materia m WHERE m.estatusMateria=1")
	public List<Materia> findAllMateria();
	
	/*@Query(value="SELECT * FROM Grupo u WHERE u.id NOT IN(SELECT i.grupo_id FROM alumnos_grupos WHERE i.matricula_id=?1)",nativeQuery = true)
	public List<Grupo> findAllGruposDisponibles(Long matricula_id);*/
}
