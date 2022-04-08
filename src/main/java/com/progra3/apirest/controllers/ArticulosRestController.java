package com.progra3.apirest.controllers;

import java.util.ArrayList;

import com.progra3.apirest.models.Articulos;
import com.progra3.apirest.services.ArticulosServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulos")
public class ArticulosRestController {
    
    @Autowired
    private ArticulosServicioImpl articuloService;
    
	@GetMapping("/maxid")
	public Articulos devolverMaxId(){
		return articuloService.DevolverMaxId();
	}

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
	public ArrayList<Articulos> getArticulos(){
		return articuloService.findAll();
	}

    @GetMapping("/buscarPor/{nombre}")
	public ResponseEntity<?> getPorNombre(@PathVariable(value = "nombre")String nombre){
		ArrayList<Articulos> listado = null;
		listado = articuloService.findByIdSQL(nombre);
		if (listado.size()>0){
			return new ResponseEntity<>(listado, HttpStatus.OK);
		}else{
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/agregar")
	public ResponseEntity<?> addArticulo(@RequestBody Articulos articulo){
		if(articuloService.findArticulo(articulo) == null) {
			articuloService.safe(articulo);
			return new ResponseEntity<> (articulo, HttpStatus.CREATED);
		}else {
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
	}

	@PutMapping("/actualizar/{id}")
	public ResponseEntity<?> updateArticulo(@PathVariable(value="id")long id, @RequestBody Articulos articulo){
		Articulos articulosDb, respuesta = null;
		articulosDb = articuloService.findById(id);
		if(articulosDb != null){
			articulosDb.setCodigo(articulo.getCodigo());
			articulosDb.setNombre(articulo.getNombre());
			articulosDb.setPrecioCompra(articulo.getPrecioCompra());
			articulosDb.setPrecioVenta(articulo.getPrecioVenta());
			articulosDb.setStock(articulo.getStock());
			respuesta = articuloService.updateArticulo(articulosDb);
			return new ResponseEntity<> (respuesta, HttpStatus.CREATED);
		}else {
			return new ResponseEntity<Void> (HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<Void> deleteArticulo(@PathVariable(value = "id")Long id){
		//Comprobar respuesta por si no existe
		articuloService.deleteArticulo(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/borrartodo")
	public ResponseEntity<Void> deleteAllArticulos(){
		articuloService.deleteAllArticulos();
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
