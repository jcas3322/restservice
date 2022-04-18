package com.progra3.apirest.services;

import java.util.ArrayList;
import java.util.Optional;

import com.progra3.apirest.models.Articulos;
import com.progra3.apirest.repositories.InArticulosDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticulosServicioImpl implements IArticulosService{
	
	@Autowired
	private InArticulosDao articulosDao;

	@Override
	@Transactional(readOnly = true)
	public ArrayList<Articulos> findAll() {
		return (ArrayList<Articulos>) articulosDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Articulos findArticulo(Articulos articulo) {
		return (Articulos) articulosDao.findByCodigo(articulo.getCodigo());
	}

	@Override
	@Transactional
	public void deleteArticulo(Articulos articulo) {
		articulosDao.deleteById(articulo.getId());
	}

	@Override
	@Transactional
	public Articulos updateArticulo(Articulos articulo) {
		return (Articulos)articulosDao.save(articulo);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Articulos> findArticuloById(Long id) {
		return (Optional<Articulos>)articulosDao.findById(id);
	}

	@Override
	@Transactional
	public void deleteArticulo(Long id) {
		articulosDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Articulos findById(Long id) {
		return (Articulos)articulosDao.findById(id).orElse(null);
	}

	@Override
	public ArrayList<Articulos> findByIdSQL(String nombre) {
		return articulosDao.findByNombreSQL(nombre);
	}

	@Override
	@Transactional
	public void safe(Articulos articulo) {
		articulosDao.save(articulo);
	}

	@Override
	@Transactional
	public void deleteAllArticulos() {
		articulosDao.deleteAll();
	}

	@Override
	@Transactional (readOnly = true)
	public Articulos DevolverMaxId() {
		return articulosDao.resultado();
	}

	@Override
	@Transactional (readOnly = true)
	public Articulos findByCodigo(String codigo) {
		return (Articulos) articulosDao.findByCodigo(codigo);
	}
}
