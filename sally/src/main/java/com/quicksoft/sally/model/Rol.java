package com.quicksoft.sally.model;

public class Rol {
	private Integer tipo;
	private Integer permisos;
	public Rol() {
		super();
	}
	public Rol(Integer tipo, Integer permisos) {
		super();
		this.tipo = tipo;
		this.permisos = permisos;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Integer getPermisos() {
		return permisos;
	}
	public void setPermisos(Integer permisos) {
		this.permisos = permisos;
	}
	
}
