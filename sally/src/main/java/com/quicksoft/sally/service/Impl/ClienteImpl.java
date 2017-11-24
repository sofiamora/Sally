package com.quicksoft.sally.service.Impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.quicksoft.sally.entity.Cliente;
import com.quicksoft.sally.repository.ClienteRepository;
import com.quicksoft.sally.service.ClienteService;

@Service("clienteService")
public class ClienteImpl implements ClienteService{
	@Autowired
	@Qualifier("clienteRepository")
	private ClienteRepository clienteRepository;
	private static final Log logger = LogFactory.getLog(ClienteImpl.class);
	
	@Override
	public Cliente registrarCliente(Cliente cliente) {
		logger.info("Registrando un cliente: "+System.currentTimeMillis());
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente modificarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente buscarCliente(String correo) {
		return clienteRepository.findByCorreo(correo);
	}

	@Override
	public Cliente login(String correo, String contraseña) {
		return clienteRepository.findByCorreoAndContraseña(correo, contraseña);
	}

	@Override
	public int eliminarCliente(Integer idCliente) {
		return 0;
	}

	@Override
	public int modificarPassword(Integer idCliente) {
		// TODO Auto-generated method stub
		return 0;
	}
}
