package com.progra3.apirest.controllers;

import java.util.ArrayList;
import java.util.Date;

import com.progra3.apirest.models.RegistroDeVentas;
import com.progra3.apirest.services.RegistroVentasServicioImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("/RegistroDeVentas")
public class RegistroDeVentasRestController {
    
    @Autowired
    private RegistroVentasServicioImpl registroVentas;

    @GetMapping("/all")
    @ResponseStatus(value = HttpStatus.OK)
    public ArrayList<RegistroDeVentas> getAll() {
        return registroVentas.findAll();
    }

    @GetMapping("/buscarFecha/{fecha}")
    public ResponseEntity<?> getIngresosPorFecha(@PathVariable(value = "fecha")Date fecha){
        ArrayList<RegistroDeVentas> listado = registroVentas.findByFecha(fecha);
        if (listado.size()>0){
            return new ResponseEntity<>(listado, HttpStatus.OK);
        }else{
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping("/agregar")
    public ResponseEntity<RegistroDeVentas> agregarIngreso(@RequestBody RegistroDeVentas ingresoVenta){
        return new ResponseEntity<RegistroDeVentas>(registroVentas.safe(ingresoVenta), HttpStatus.CREATED);
    }
    
    
}
