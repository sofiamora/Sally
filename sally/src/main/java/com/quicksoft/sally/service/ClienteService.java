package com.quicksoft.sally.service;

import com.quicksoft.sally.entity.Cliente;

public interface ClienteService {
	public abstract Cliente registrarCliente(Cliente cliente);
	public abstract Cliente modificarCliente(Cliente cliente);
	public abstract Cliente buscarCliente(String correo);
	public abstract Cliente login(String correo, String contraseña);
	public abstract int notificarRegistro(Cliente cliente);
	public abstract int eliminarCliente(Integer idCliente);
	public abstract int modificarPassword(Integer idCliente);
}
