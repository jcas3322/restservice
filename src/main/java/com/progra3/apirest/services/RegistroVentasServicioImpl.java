package com.progra3.apirest.services;

import java.util.ArrayList;
import java.util.Date;

import com.progra3.apirest.models.RegistroDeVentas;
import com.progra3.apirest.repositories.InRegistroVentasDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistroVentasServicioImpl implements IRegistroVentasService{

    @Autowired
    private InRegistroVentasDao registroVentas;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<RegistroDeVentas> findAll() {
        return (ArrayList<RegistroDeVentas>) registroVentas.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<RegistroDeVentas> findByFecha(Date fecha) {
        return registroVentas.findByFechaVenta(fecha);
    }

    @Override
    @Transactional
    public RegistroDeVentas safe(RegistroDeVentas nuevoRegistro) {
        return registroVentas.save(nuevoRegistro);
    }
    
}
