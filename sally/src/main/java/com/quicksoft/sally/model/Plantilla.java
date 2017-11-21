package com.quicksoft.sally.model;

public class Plantilla {
	private Integer estatus;
	private Cliente creador;
	private Cliente dueño;
	private String objetivo;
	public Plantilla() {
		super();
	}
	public Plantilla(Integer estatus, Cliente creador, Cliente dueño, String objetivo) {
		super();
		this.estatus = estatus;
		this.creador = creador;
		this.dueño = dueño;
		this.objetivo = objetivo;
	}
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	public Cliente getCreador() {
		return creador;
	}
	public void setCreador(Cliente creador) {
		this.creador = creador;
	}
	public Cliente getDueño() {
		return dueño;
	}
	public void setDueño(Cliente dueño) {
		this.dueño = dueño;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	
}
