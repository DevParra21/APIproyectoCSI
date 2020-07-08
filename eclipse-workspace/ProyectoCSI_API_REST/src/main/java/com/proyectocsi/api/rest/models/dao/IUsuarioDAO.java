package com.proyectocsi.api.rest.models.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.proyectocsi.api.rest.models.entity.Alumno;
import com.proyectocsi.api.rest.models.entity.Profesor;
import com.proyectocsi.api.rest.models.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {
	
	
	@Query("SELECT u FROM Usuario u WHERE u.nombreUsuario=?1")
	public Usuario findByNombreUsuario(String nombreUsuario);
	
	@Query("SELECT a FROM Alumno a INNER JOIN Usuario u ON a.usuario = u WHERE u.nombreUsuario=?1")
	public Alumno findByNombreUsuarioAlumno(String nombreUsuario);
	
	@Query("SELECT p FROM Profesor p INNER JOIN Usuario u ON p.usuario = u WHERE u.nombreUsuario=?1")
	public Profesor findByNombreUsuarioProfesor(String nombreUsuario);
	
}
