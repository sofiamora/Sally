package com.quicksoft.sally.model;

import java.util.Date;

public class CompraModel {
	private String customerId;
	private String compañia;
	private Double precio;
	private MetodoPago metodoPago;
	private String moneda;
	private String descripción;
	private String numeroReferencia;
	private String paymetnId;
	private Date fecha;
	
	public CompraModel() {
		super();
	}
	
	public CompraModel(String customerId, String compañia, Double precio, MetodoPago metodoPago, String moneda,
			String descripción, String numeroReferencia, String paymetnId, Date fecha) {
		super();
		this.customerId = customerId;
		this.compañia = compañia;
		this.precio = precio;
		this.metodoPago = metodoPago;
		this.moneda = moneda;
		this.descripción = descripción;
		this.numeroReferencia = numeroReferencia;
		this.paymetnId = paymetnId;
		this.fecha = fecha;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public MetodoPago getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public String getNumeroReferencia() {
		return numeroReferencia;
	}
	public void setNumeroReferencia(String numeroReferencia) {
		this.numeroReferencia = numeroReferencia;
	}
	public String getPaymetnId() {
		return paymetnId;
	}
	public void setPaymetnId(String paymetnId) {
		this.paymetnId = paymetnId;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
