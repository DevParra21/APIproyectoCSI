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

import com.proyectocsi.api.rest.models.entity.Usuario;
import com.proyectocsi.api.rest.models.services.IUsuarioService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> index(){
		return this.usuarioService.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<?> show(@PathVariable Long id) {
		Usuario consultaUsuario = null;
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			consultaUsuario = this.usuarioService.findById(id);
			if(consultaUsuario == null) {
				response.put("mensaje", "usuario no existe");
				return new ResponseEntity<Map<String,Object>>(response, HttpStatus.NOT_FOUND);
			}
		}
		catch(DataAccessException ex) {
			response.put("mensaje", "error al realizar consulta");
			response.put("error", ex.getMessage().concat(": ").concat(ex.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Usuario>(consultaUsuario, HttpStatus.OK);
	}
	
	@PostMapping("/registra-usuario")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		return this.usuarioService.save(usuario);
	}
	
	@PutMapping("modifica-usuario/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario usuarioActual = this.usuarioService.findById(id);
		
		usuarioActual.setApellidoMaterno(usuario.getApellidoMaterno());
		usuarioActual.setApellidoPaterno(usuario.getApellidoPaterno());
		usuarioActual.setContrasenia(usuario.getContrasenia());
		usuarioActual.setNombre(usuario.getNombre());
		usuarioActual.setNombreUsuario(usuario.getNombreUsuario());
		
		return this.usuarioService.save(usuarioActual);
	}
	
	@DeleteMapping("elimina-usuario/{id}")
	@ResponseStatus(code=HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		this.usuarioService.delete(id);
	}

}
