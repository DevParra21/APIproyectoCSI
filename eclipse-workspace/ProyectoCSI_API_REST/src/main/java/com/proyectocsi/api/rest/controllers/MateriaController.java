package com.proyectocsi.api.rest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyectocsi.api.rest.models.entity.Materia;
import com.proyectocsi.api.rest.models.services.IMateriaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class MateriaController {
	
	@Autowired
	private IMateriaService materia;
	
	@GetMapping("/materias")
	public List<Materia> index(){
		return materia.findAll();
	}
	
	@GetMapping("/materias/{id}")
	public ResponseEntity<?> show(@PathVariable Long id) {
		Materia consultaMateria = null;
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			consultaMateria = this.materia.findById(id);
			if(consultaMateria == null) {
				response.put("mensaje", "Materia no existe");
				return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
			}
			
		}
		catch(DataAccessException ex) {
			response.put("mensaje", "error al realizar la petición al servidor.");
			response.put("error", ex.getMessage().concat(": ").concat(ex.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Materia>(consultaMateria, HttpStatus.OK);
	}
	
	@PostMapping("registra-materia")
	public ResponseEntity<?> create(@RequestBody Materia materia) {
		Materia nuevaMateria = null;
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			nuevaMateria = this.materia.save(materia);
		}
		catch(DataAccessException ex) {
			response.put("mensaje", "error al registrar los datos de la materia");
			response.put("error", ex.getMessage().concat(": ").concat(ex.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("mensaje", "Materia registrada correctamente");
		response.put("materia", nuevaMateria);
		
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.CREATED);
	}
	
	@PutMapping("modifica-materia/{id}")
	public ResponseEntity<?> update(@RequestBody Materia materia, @PathVariable Long id) {
		Materia actualizacionMateria = null;
		Materia materiaActual = this.materia.findById(id);
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			if(materiaActual==null) {
				response.put("mensaje", "Error al intentar actualizar la materia. No se encontró ninguna materia con ese id.");
				return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
			}
			materiaActual.setClaveMateria(materia.getClaveMateria());
			materiaActual.setNombreMateria(materia.getNombreMateria());
			materiaActual.setEstatusMateria(materia.getEstatusMateria());
			
			actualizacionMateria = this.materia.save(materiaActual);
			
		}
		catch(DataAccessException ex) {
			response.put("mensaje", "Error al intentar actualizar la materia");
			response.put("error",ex.getMessage().concat(": ").concat(ex.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "Actualización de materia finalizada correctamente.");
		response.put("materia",actualizacionMateria);
		
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
		
	}
	
	@DeleteMapping("elimina-materia/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		this.materia.delete(id);
	}
	
	
}
