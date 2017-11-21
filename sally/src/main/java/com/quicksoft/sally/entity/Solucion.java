package com.quicksoft.sally.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="solucion")
public class Solucion {
	@EmbeddedId
	private SolucionId solucionId;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="jerarquia")
	private Integer jerarquia;
	
	@Column(name="estatus")
	private Integer estatus;

	public Solucion() {
		
	}
	public Solucion(SolucionId solucionId, String descripcion, Integer jerarquia, Integer estatus) {
		super();
		this.solucionId = solucionId;
		this.descripcion = descripcion;
		this.jerarquia = jerarquia;
		this.estatus = estatus;
	}

	public SolucionId getSolucionId() {
		return solucionId;
	}

	public void setSolucionId(SolucionId solucionId) {
		this.solucionId = solucionId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getJerarquia() {
		return jerarquia;
	}

	public void setJerarquia(Integer jerarquia) {
		this.jerarquia = jerarquia;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	
	
}
