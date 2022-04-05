package com.progra3.apirest.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ArticulosVendidos")
public class ArticulosVendidos implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;
    
    private long idVenta;
    private long idArticulo;
    private int cantidadVendida;
    public long getId() {
        return id;
    }
    public int getCantidadVendida() {
        return cantidadVendida;
    }
    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
    public long getIdArticulo() {
        return idArticulo;
    }
    public void setIdArticulo(long idArticulo) {
        this.idArticulo = idArticulo;
    }
    public long getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(long idVenta) {
        this.idVenta = idVenta;
    }
    public void setId(long id) {
        this.id = id;
    }

}
