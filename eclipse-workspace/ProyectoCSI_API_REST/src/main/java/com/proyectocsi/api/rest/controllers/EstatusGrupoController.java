package com.proyectocsi.api.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectocsi.api.rest.models.entity.EstatusGrupo;
import com.proyectocsi.api.rest.models.services.IEstatusGrupoService;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EstatusGrupoController {
	
	@Autowired
	private IEstatusGrupoService estatusGrupo;
	
	@GetMapping("/estatusgrupo")
	public List<EstatusGrupo> index(){
		return estatusGrupo.findAll();
	}
}
