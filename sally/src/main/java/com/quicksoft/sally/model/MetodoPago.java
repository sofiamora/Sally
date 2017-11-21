package com.quicksoft.sally.model;

public class MetodoPago {
	private String numeroTarjeta;
	private String vigencia;
	private String numeroCondfidencial;
	
	public MetodoPago() {
		super();
	}
	
	public MetodoPago(String numeroTarjeta, String vigencia, String numeroCondfidencial) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.vigencia = vigencia;
		this.numeroCondfidencial = numeroCondfidencial;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getVigencia() {
		return vigencia;
	}
	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}
	public String getNumeroCondfidencial() {
		return numeroCondfidencial;
	}
	public void setNumeroCondfidencial(String numeroCondfidencial) {
		this.numeroCondfidencial = numeroCondfidencial;
	}
	
	
}
