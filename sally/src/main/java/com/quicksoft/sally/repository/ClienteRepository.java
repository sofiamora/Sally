package com.quicksoft.sally.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quicksoft.sally.entity.Cliente;

@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{
	public abstract Cliente findByCorreo(String correo);
	public abstract Cliente findByCorreoAndContraseña(String correo, String contraseña);
}
