package com.quicksoft.sally.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Moneda")
public class Moneda {
	@Id
	@GeneratedValue
	@Column(name="id_moneda")
	private Integer idMoneda;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="estatus")
	private Integer estatus;
	
	public Moneda() {
		
	}
	
	public Moneda(Integer idMoneda, String nombre, Integer estatus) {
		super();
		this.idMoneda = idMoneda;
		this.nombre = nombre;
		this.estatus = estatus;
	}
	public Integer getIdMoneda() {
		return idMoneda;
	}
	public void setIdMoneda(Integer idMoneda) {
		this.idMoneda = idMoneda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	
	
}
