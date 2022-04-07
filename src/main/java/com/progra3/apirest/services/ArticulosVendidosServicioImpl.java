package com.progra3.apirest.services;

import java.util.ArrayList;

import com.progra3.apirest.models.ArticulosVendidos;
import com.progra3.apirest.repositories.InArticulosVendidosDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticulosVendidosServicioImpl implements IArticulosVendidosService{

    @Autowired
    private InArticulosVendidosDao articulosVendidos;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<ArticulosVendidos> findAll() {
        return (ArrayList<ArticulosVendidos>) articulosVendidos.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<ArticulosVendidos> findByIdVenta(Long id) {
        return articulosVendidos.findByIdVenta(id);
    }

    @Override
    @Transactional
    public ArticulosVendidos safe(ArticulosVendidos articulo) {
        return articulosVendidos.save(articulo);
    }
    
}
