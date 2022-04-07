package com.progra3.apirest.services;

import java.util.ArrayList;
import java.util.Date;

import com.progra3.apirest.models.ArticulosIngresados;

public interface IArticulosIngresadosService {
    public ArrayList<ArticulosIngresados> findAll();

    public ArrayList<ArticulosIngresados> findByFecha(Date fecha);

    public ArticulosIngresados safe(ArticulosIngresados ingresoArticulo);
}
