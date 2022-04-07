package com.progra3.apirest.services;

import java.util.ArrayList;
import java.util.Date;

import com.progra3.apirest.models.ArticulosIngresados;
import com.progra3.apirest.repositories.InArticulosIngresadosDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticulosIngresadosServicioImpl implements IArticulosIngresadosService {

    @Autowired
    private InArticulosIngresadosDao articulosIngresados;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<ArticulosIngresados> findAll() {
        return (ArrayList<ArticulosIngresados>) articulosIngresados.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<ArticulosIngresados> findByFecha(Date fecha) {
        return articulosIngresados.findByFechaIngreso(fecha);
    }

    @Override
    @Transactional
    public ArticulosIngresados safe(ArticulosIngresados ingresoArticulo) {
        return articulosIngresados.save(ingresoArticulo);
    }
    
}
