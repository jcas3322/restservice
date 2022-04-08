package com.progra3.apirest.models;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "RegistroDeVentas")
public class RegistroDeVentas implements Serializable {

    @Id
    @Column (unique = true)
    private long id;

    //@Temporal(TemporalType.TIMESTAMP)
    private Date fechaVenta;

    //@Temporal(TemporalType.TIMESTAMP)
    private Time horaVenta;

    @PrePersist 
    public void prePersist(){
        fechaVenta=new Date(new java.util.Date().getTime());
        horaVenta= new Time(new java.util.Date().getTime());
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
    public Time getHoraVenta() {
        return horaVenta;
    }
    public void setHoraVenta(Time horaVenta) {
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
