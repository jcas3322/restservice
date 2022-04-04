package com.progra3.apirest.controllers;

import java.util.ArrayList;

import com.progra3.apirest.models.Articulos;
import com.progra3.apirest.services.ArticulosServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ArticulosRestController {
    
    @Autowired
    private ArticulosServicioImpl articuloService;
    
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
	public ArrayList<Articulos> getProfesores(){
		return articuloService.findAll();
	}
	
	@PostMapping("/sign_up")
	public ResponseEntity<Void> addArticulo(@RequestBody Articulos articulo){
		if(articuloService.findArticulo(articulo) == null) {
			articuloService.safe(articulo);
			return new ResponseEntity<Void> (HttpStatus.CREATED);
		}else {
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
	}
}
