package com.quicksoft.sally.model;

public class Plantilla {
	private Integer estatus;
	private ClienteModel creador;
	private ClienteModel dueño;
	private String objetivo;
	public Plantilla() {
		super();
	}
	public Plantilla(Integer estatus, ClienteModel creador, ClienteModel dueño, String objetivo) {
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
	public ClienteModel getCreador() {
		return creador;
	}
	public void setCreador(ClienteModel creador) {
		this.creador = creador;
	}
	public ClienteModel getDueño() {
		return dueño;
	}
	public void setDueño(ClienteModel dueño) {
		this.dueño = dueño;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	
}
