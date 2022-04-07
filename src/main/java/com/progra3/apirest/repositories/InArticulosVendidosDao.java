package com.progra3.apirest.repositories;

import java.util.ArrayList;

import com.progra3.apirest.models.ArticulosVendidos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InArticulosVendidosDao extends CrudRepository<ArticulosVendidos,Long>{
    public ArrayList<ArticulosVendidos> findByIdVenta(Long idVenta);
}
