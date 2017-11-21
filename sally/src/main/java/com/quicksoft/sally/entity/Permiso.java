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
@Table(name="permiso")
public class Permiso {
	
	@Id
	@GeneratedValue
	@Column(name="id_permiso")
	private Integer idPermiso;
	
	@Column(name="valor")
	private Integer valor;
	
	@Column(name="estatus")
	private Integer estatus;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_rol")
	private Rol rol;

	public Permiso() {
		
	}
	
	public Permiso(Integer idPermiso, Integer valor, Integer estatus,Rol rol) {
		super();
		this.idPermiso = idPermiso;
		this.valor = valor;
		this.estatus = estatus;
		this.rol=rol;
	}

	public Integer getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(Integer idPermiso) {
		this.idPermiso = idPermiso;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}
