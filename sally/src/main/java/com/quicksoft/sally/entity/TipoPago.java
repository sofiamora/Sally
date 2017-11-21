package com.quicksoft.sally.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipopago")
public class TipoPago {
	@Id
	@GeneratedValue
	@Column(name="id_pago")
	private Integer idPago;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="estatus")
	private Integer estatus;
	
	public TipoPago() {
		
	}
	
	public TipoPago(Integer idPago, String descripcion, Integer estatus) {
		super();
		this.idPago = idPago;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}
	
	public Integer getIdPago() {
		return idPago;
	}
	public void setIdPago(Integer idPago) {
		this.idPago = idPago;
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
