package com.progra3.apirest.repositories;

import java.sql.Date;
import java.util.ArrayList;

import com.progra3.apirest.models.RegistroDeVentas;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InRegistroVentasDao extends CrudRepository<RegistroDeVentas, Long>{
    public ArrayList<RegistroDeVentas> findByFechaVenta(Date fechaVenta);

    //Query Methods
    @Query(value = "select * from registro_de_ventas where id = (select max(id) from registro_de_ventas)",nativeQuery = true) 
    public RegistroDeVentas maxId();

}
