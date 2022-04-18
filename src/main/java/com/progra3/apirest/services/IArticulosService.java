package com.progra3.apirest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.progra3.apirest.models.Articulos;

public interface IArticulosService {
	public List<Articulos> findAll();
	
	public Articulos findArticulo(Articulos articulo);

	public Articulos findByCodigo(String codigo);
	
	public void deleteArticulo(Articulos articulo);
	
	public Articulos updateArticulo(Articulos articulo);
	
	public Optional<Articulos> findArticuloById(Long id);
	
	public void deleteArticulo(Long id);

	public void deleteAllArticulos();
	
	public Articulos findById (Long id);
	
	public ArrayList<Articulos> findByIdSQL(String nombre);
	
	public void safe (Articulos articulo);

	public Articulos DevolverMaxId();

}
