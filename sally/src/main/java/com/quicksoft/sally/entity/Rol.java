package com.quicksoft.sally.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="rol")
	private List<Permiso> permisos;
	
	public Rol() {
		
	}
	
	public Rol(Integer idRol, String tipo, Integer estatus, List<Permiso> permisos) {
		super();
		this.idRol = idRol;
		this.tipo = tipo;
		this.estatus = estatus;
		this.permisos = permisos;
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

	public List<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}
	
	
	
}
