package com.quicksoft.sally.model;

public class Criterio {
	private Solucion solucion;
	private String nombre;
	private Integer ponderacion;
	public Criterio() {
		super();
	}
	public Criterio(Solucion solucion, String nombre, Integer ponderacion) {
		super();
		this.solucion = solucion;
		this.nombre = nombre;
		this.ponderacion = ponderacion;
	}
	public Solucion getSolucion() {
		return solucion;
	}
	public void setSolucion(Solucion solucion) {
		this.solucion = solucion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPonderacion() {
		return ponderacion;
	}
	public void setPonderacion(Integer ponderacion) {
		this.ponderacion = ponderacion;
	}
	
}
