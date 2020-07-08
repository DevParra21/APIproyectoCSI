package com.proyectocsi.api.rest.models.services;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectocsi.api.rest.models.dao.IUsuarioDAO;
import com.proyectocsi.api.rest.models.entity.Alumno;
import com.proyectocsi.api.rest.models.entity.Profesor;
import com.proyectocsi.api.rest.models.entity.Usuario;

@Service
public class UsuarioAuthService implements UserDetailsService {
	
	private Logger logger = LoggerFactory.getLogger(UsuarioAuthService.class);
	
	@Autowired
	private IUsuarioDAO usuarioDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioDao.findByNombreUsuario(username);
		if(usuario==null) {
			logger.error("Error al iniciar sesión: Credenciales inválidas.");
			throw new UsernameNotFoundException("Error al iniciar sesión: Credenciales inválidas.");
		}
		List<GrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(usuario.getRol().getNombre()));
		
		return new User(usuario.getNombreUsuario(), usuario.getContrasenia(), true, true, true, true, authorities);
	}

	@Transactional(readOnly = true)
	public Usuario findByNombreUsuario(String nombreUsuario) {
		// TODO Auto-generated method stub
		return usuarioDao.findByNombreUsuario(nombreUsuario);
	}
	
	@Transactional(readOnly = true)
	public Alumno findByNombreUsuarioAlumno(String nombreUsuario) {
		return usuarioDao.findByNombreUsuarioAlumno(nombreUsuario);
	}
	
	@Transactional(readOnly = true)
	public Profesor findByNombreUsuarioProfesor(String nombreUsuario) {
		return usuarioDao.findByNombreUsuarioProfesor(nombreUsuario);
	}
	
}
