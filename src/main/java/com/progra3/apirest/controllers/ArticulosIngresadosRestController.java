package com.progra3.apirest.controllers;

import java.util.ArrayList;

import com.progra3.apirest.models.ArticulosIngresados;
import com.progra3.apirest.services.ArticulosIngresadosServicioImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulosIngresados")
public class ArticulosIngresadosRestController {

    @Autowired
    private ArticulosIngresadosServicioImpl articulosIngresados;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<ArticulosIngresados> getArticulosIngresados(){
        return articulosIngresados.findAll();
    }
    
}
