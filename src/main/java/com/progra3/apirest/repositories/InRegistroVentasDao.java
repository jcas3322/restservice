package com.progra3.apirest.repositories;

import java.util.Date;
import java.util.ArrayList;

import com.progra3.apirest.models.RegistroDeVentas;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InRegistroVentasDao extends CrudRepository<RegistroDeVentas, Long>{
    public ArrayList<RegistroDeVentas> findByFechaVenta(Date fechaVenta);
}
