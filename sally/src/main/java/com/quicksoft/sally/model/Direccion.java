package com.quicksoft.sally.model;

public class Direccion {
	private String calle;
	private String ciudad;
	private String pais;
	private String cp;
	private Integer estatus;
	public Direccion() {
		super();
	}
	public Direccion(String calle, String ciudad, String pais, String cp, Integer estatus) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.pais = pais;
		this.cp = cp;
		this.estatus = estatus;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	
}
