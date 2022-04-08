package com.progra3.apirest.repositories;

import java.util.ArrayList;
import java.sql.Date;

import com.progra3.apirest.models.ArticulosIngresados;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InArticulosIngresadosDao extends CrudRepository<ArticulosIngresados, Long>{
    public ArrayList<ArticulosIngresados> findByFechaIngreso (Date fechaIngreso);
}
