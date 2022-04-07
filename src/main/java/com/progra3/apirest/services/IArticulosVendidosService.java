package com.progra3.apirest.services;

import java.util.ArrayList;

import com.progra3.apirest.models.ArticulosVendidos;

public interface IArticulosVendidosService {
    public ArrayList<ArticulosVendidos> findAll();

    public ArrayList<ArticulosVendidos> findByIdVenta(Long id);
}
