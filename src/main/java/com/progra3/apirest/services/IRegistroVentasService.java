package com.progra3.apirest.services;

import java.util.ArrayList;
import java.util.Date;

import com.progra3.apirest.models.RegistroDeVentas;

public interface IRegistroVentasService {
    public ArrayList<RegistroDeVentas> findAll();

    public ArrayList<RegistroDeVentas> findByFecha(Date fecha);
}
