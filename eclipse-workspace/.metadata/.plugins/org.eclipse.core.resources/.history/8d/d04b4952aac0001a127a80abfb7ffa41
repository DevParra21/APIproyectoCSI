package com.proyectocsi.api.rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectocsi.api.rest.models.dao.IUsuarioDAO;
import com.proyectocsi.api.rest.models.entity.Usuario;

@Service
public class UsuarioImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioDAO usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll()
	{
		return (List<Usuario>)usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuarioDao.deleteById(id);
	}
}
