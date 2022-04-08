package com.progra3.apirest.controllers;

import java.util.ArrayList;
import java.sql.Date;

import com.progra3.apirest.models.ArticulosIngresados;
import com.progra3.apirest.services.ArticulosIngresadosServicioImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/buscarFecha/{fecha}")
    public ResponseEntity<?> getIngresosPorFecha(@PathVariable(value = "fecha")Date fecha){
        ArrayList<ArticulosIngresados> listado = articulosIngresados.findByFecha(fecha);
        if (listado.size()>0){
            return new ResponseEntity<>(listado, HttpStatus.OK);
        }else{
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping("/agregar")
    public ResponseEntity<ArticulosIngresados> agregarIngreso(@RequestBody ArticulosIngresados ingresoArticulo){
        return new ResponseEntity<ArticulosIngresados>(articulosIngresados.safe(ingresoArticulo), HttpStatus.CREATED);
    }
    
}
