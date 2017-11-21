package com.quicksoft.sally.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ocupacion")
public class Ocupacion {
	@Id
	@GeneratedValue
	@Column(name="id_ocupacion")
	private Integer idOcupacion;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="estatus")
	private Integer estatus;
	
	public Ocupacion() {
		
	}
	
	public Ocupacion(Integer idOcupacion, String descripcion, Integer estatus) {
		super();
		this.idOcupacion = idOcupacion;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	public Integer getIdOcupacion() {
		return idOcupacion;
	}

	public void setIdOcupacion(Integer idOcupacion) {
		this.idOcupacion = idOcupacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	
	
}
