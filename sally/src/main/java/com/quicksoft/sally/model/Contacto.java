package com.quicksoft.sally.model;

public class Contacto {
	private Integer tipo;
	private String descripcion;
	private String estatus;
	public Contacto() {
		super();
	}
	public Contacto(Integer tipo, String descripcion, String estatus) {
		super();
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
}
