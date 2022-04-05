package com.progra3.apirest.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RegistroDeVentas")
public class RegistroDeVentas implements Serializable {

    @Id
    @Column (unique = true)
    private long id;

    @Temporal(TemporalType.DATE)
    private Date fechaVenta;

    @Temporal(TemporalType.TIME)
    private Date horaVenta;

    @PrePersist 
    public void prePersist(){
        fechaVenta=new Date();
        horaVenta= new Date();
    }
    private Double montoVenta;
    private int cantidadArticulosVendidos;
    public long getId() {
        return id;
    }
    public int getCantidadArticulosVendidos() {
        return cantidadArticulosVendidos;
    }
    public void setCantidadArticulosVendidos(int cantidadArticulosVendidos) {
        this.cantidadArticulosVendidos = cantidadArticulosVendidos;
    }
    public Double getMontoVenta() {
        return montoVenta;
    }
    public void setMontoVenta(Double montoVenta) {
        this.montoVenta = montoVenta;
    }
    public Date getHoraVenta() {
        return horaVenta;
    }
    public void setHoraVenta(Date horaVenta) {
        this.horaVenta = horaVenta;
    }
    public Date getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public void setId(long id) {
        this.id = id;
    }
    
}
