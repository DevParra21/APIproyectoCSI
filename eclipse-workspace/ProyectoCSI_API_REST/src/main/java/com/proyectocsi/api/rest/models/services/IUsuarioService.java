package com.proyectocsi.api.rest.models.services;

import java.util.List;


import com.proyectocsi.api.rest.models.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
	
	
}
