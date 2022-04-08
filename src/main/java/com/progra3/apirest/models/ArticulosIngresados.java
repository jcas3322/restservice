package com.progra3.apirest.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table (name = "ArticulosIngresados")
public class ArticulosIngresados implements Serializable{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (unique = true)
    private long id;
    private long idArticulo;
    private int cantidadIngreso;
    private Date fechaIngreso;

    @PrePersist
    public void prePersist(){
        fechaIngreso = new Date(new java.util.Date().getTime());
    }

    public long getId() {
        return id;
    }
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public int getCantidadIngreso() {
        return cantidadIngreso;
    }
    public void setCantidadIngreso(int cantidadIngreso) {
        this.cantidadIngreso = cantidadIngreso;
    }
    public long getIdArticulo() {
        return idArticulo;
    }
    public void setIdArticulo(long idArticulo) {
        this.idArticulo = idArticulo;
    }
    public void setId(long id) {
        this.id = id;
    }
    
}
