package com.progra3.apirest.models;

import javax.persistence.*;

@Entity
@Table(name = "Articulos")
public class Articulos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (unique = true)
	private Long id;
	private String codigo;
	private String nombre;
	private Double precioCompra;
	private Double precioVenta;
	private String urlImagen;
	public Long getId() {
		return id;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	public Double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
