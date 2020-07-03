package com.proyectocsi.api.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectocsi.api.rest.models.entity.Rol;
import com.proyectocsi.api.rest.models.services.IRolService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class RolRestController {
	
	@Autowired
	private IRolService rolService;
	
	@GetMapping("/roles")
	public List<Rol> index()
	{
		return this.rolService.findAll();
	}
}
