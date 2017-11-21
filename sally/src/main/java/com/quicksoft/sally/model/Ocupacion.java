package com.quicksoft.sally.model;

public class Ocupacion {
	private String descripcion;
	private String estatus;
	public Ocupacion() {
		super();
	}
	public Ocupacion(String descripcion, String estatus) {
		super();
		this.descripcion = descripcion;
		this.estatus = estatus;
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
