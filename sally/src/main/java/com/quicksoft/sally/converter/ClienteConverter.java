package com.quicksoft.sally.converter;

import org.springframework.stereotype.Component;

import com.quicksoft.sally.entity.Cliente;
import com.quicksoft.sally.model.ClienteModel;

@Component("clienteConverter")
public class ClienteConverter {

	//Entity -> Model
	public ClienteModel entityToModel(Cliente cliente) {
		ClienteModel model = new ClienteModel();
		model.setNombreUsuario(cliente.getNombre());
		model.setApellidoMaterno(cliente.getApellidoPaterno());
		model.setApellidoPaterno(cliente.getApellidoPaterno());
		model.setCorreo(cliente.getCorreo());
		model.setContraseña(cliente.getContraseña());
		model.setSexo(cliente.getSexo());
		model.setEdad(cliente.getEdad());
		return model;
	}
	//Model -> Entity
	public Cliente modelToEntity(ClienteModel model) {
		Cliente cliente = new Cliente();
		cliente.setNombre(model.getNombreUsuario());
		cliente.setApellidoPaterno(model.getApellidoPaterno());
		cliente.setApellidoMaterno(model.getApellidoPaterno());
		cliente.setCorreo(model.getCorreo());
		cliente.setContraseña(model.getContraseña());
		cliente.setSexo(cliente.getSexo());
		cliente.setEdad(model.getEdad());
		return cliente;
	}
}
