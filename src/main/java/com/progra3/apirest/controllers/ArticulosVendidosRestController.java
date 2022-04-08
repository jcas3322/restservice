package com.progra3.apirest.controllers;

import java.util.ArrayList;

import com.progra3.apirest.models.ArticulosVendidos;
import com.progra3.apirest.services.ArticulosVendidosServicioImpl;

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
@RequestMapping("/ArticulosVendidos")
public class ArticulosVendidosRestController {
    
    @Autowired
    private ArticulosVendidosServicioImpl articulosVendidos;

    @GetMapping("/all")
    @ResponseStatus(value = HttpStatus.OK)
    public ArrayList<ArticulosVendidos> getAll() {
        return articulosVendidos.findAll();
    }

    @GetMapping("/buscarIdVenta/{venta}")
    public ResponseEntity<?> getIngresosPorFecha(@PathVariable(value = "venta")Long venta){
        ArrayList<ArticulosVendidos> listado = articulosVendidos.findByIdVenta(venta);
        if (listado.size()>0){
            return new ResponseEntity<>(listado, HttpStatus.OK);
        }else{
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping("/agregar")
    public ResponseEntity<ArticulosVendidos> agregarIngreso(@RequestBody ArticulosVendidos ingresoVenta){
        return new ResponseEntity<ArticulosVendidos>(articulosVendidos.safe(ingresoVenta), HttpStatus.CREATED);
    }
}
