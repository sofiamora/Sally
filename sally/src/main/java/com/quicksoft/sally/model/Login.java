package com.quicksoft.sally.model;

public class Login {
	private ClienteModel cliente;
	private String correo;
	private String password;
	public Login() {
		super();
	}
	public Login(ClienteModel cliente, String correo, String password) {
		super();
		this.cliente = cliente;
		this.correo = correo;
		this.password = password;
	}
	public ClienteModel getCliente() {
		return cliente;
	}
	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
