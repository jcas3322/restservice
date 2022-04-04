package com.progra3.apirest.services;

import java.util.List;
import java.util.Optional;

import com.progra3.apirest.models.Articulos;

public interface IArticulosService {
	public List<Articulos> findAll();
	
	public Articulos findArticulo(Articulos articulo);
	
	public void deleteArticulo(Articulos articulo);
	
	public Articulos updateArticulo(Articulos articulo);
	
	public Optional<Articulos> findArticuloById(Long id);
	
	public void deleteArticulo(Long id);
	
	public Articulos findById (Long id);
	
	public Articulos findByIdSQL(String nombre);
	
	public void safe (Articulos articulo);

}
