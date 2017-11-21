package com.quicksoft.sally.model;

import java.util.List;

public class Solucion {
	private Integer estatus;
	private Double jerarquia;
	private String nombre;
	private List<Criterio> criterios;
	
	public Solucion() {
		super();
	}
	
	public Solucion(Integer estatus, Double jerarquia, String nombre, List<Criterio> criterios) {
		super();
		this.estatus = estatus;
		this.jerarquia = jerarquia;
		this.nombre = nombre;
		this.criterios = criterios;
	}
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	public Double getJerarquia() {
		return jerarquia;
	}
	public void setJerarquia(Double jerarquia) {
		this.jerarquia = jerarquia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Criterio> getCriterios() {
		return criterios;
	}
	public void setCriterios(List<Criterio> criterios) {
		this.criterios = criterios;
	}
	
	
}
