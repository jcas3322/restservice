package com.progra3.apirest.services;

import java.util.ArrayList;
import java.sql.Date;

import com.progra3.apirest.models.RegistroDeVentas;

public interface IRegistroVentasService {
    public ArrayList<RegistroDeVentas> findAll();

    public ArrayList<RegistroDeVentas> findByFecha(Date fecha);

    public RegistroDeVentas safe(RegistroDeVentas nuevoRegistro);

    public RegistroDeVentas maximoId();
}
