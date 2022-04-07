package com.progra3.apirest.repositories;

import java.util.ArrayList;
import java.util.Optional;

import com.progra3.apirest.models.Articulos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InArticulosDao extends CrudRepository<Articulos, Long>{

    public Articulos findByCodigo(String codigo);
    public Articulos findByCodigoAndNombre(String codigo, String nombre);
    public Optional<Articulos> findById(Long id);

    //Query Methods
    @Query("select max(id) from Articulos") 
    Long resultado();

    @Query("select p from Articulos p where p.nombre like %?1%")
	public ArrayList<Articulos> findByNombreSQL(String nombre);
    
}
