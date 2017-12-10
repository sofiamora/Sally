package com.quicksoft.sally.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="rol")
public class Rol {
	@Id
	@GeneratedValue
	@Column(name="id_rol")
	private Integer idRol;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="estatus")
	private Integer estatus;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	public Rol() {
		
	}
	
	public Rol(Integer idRol, String tipo, Integer estatus, Cliente cliente) {
		super();
		this.idRol = idRol;
		this.tipo = tipo;
		this.estatus = estatus;
		this.cliente = cliente;
	}


	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	
}
