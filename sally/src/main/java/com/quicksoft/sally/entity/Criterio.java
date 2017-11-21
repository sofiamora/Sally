package com.quicksoft.sally.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="criterio")
public class Criterio {
	@EmbeddedId
	private CriterioId criterioId;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="ponderacion")
	private Integer ponderacion;
	
	@Column(name="contenido")
	private Double contenido;

	public Criterio(){
		
	}
	
	public Criterio(CriterioId criterioId, String descripcion, Integer ponderacion, Double contenido) {
		super();
		this.criterioId = criterioId;
		this.descripcion = descripcion;
		this.ponderacion = ponderacion;
		this.contenido = contenido;
	}

	public CriterioId getCriterioId() {
		return criterioId;
	}

	public void setCriterioId(CriterioId criterioId) {
		this.criterioId = criterioId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPonderacion() {
		return ponderacion;
	}

	public void setPonderacion(Integer ponderacion) {
		this.ponderacion = ponderacion;
	}

	public Double getContenido() {
		return contenido;
	}

	public void setContenido(Double contenido) {
		this.contenido = contenido;
	}
	
	
}
