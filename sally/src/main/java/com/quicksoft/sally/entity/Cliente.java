package com.quicksoft.sally.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue
	@Column(name="id_cliente")
	private Integer idCliente;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidoP")
	private String apellidoPaterno;
	
	@Column(name="apellidoM")
	private String apellidoMaterno;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="correo", unique=true)
	private String correo;
	
	@Column(name="contraseña", length=60)
	private String contraseña;
	
	@Column(name="edad")
	private Integer edad;
	
	@Column(name="activo")
	private boolean enabled;
	
	@OneToMany(mappedBy = "cliente", fetch=FetchType.EAGER)
	private List<Rol> roles;
	
	@OneToMany( mappedBy="cliente")
	private List<Contacto> contactos;
	
	@OneToMany( mappedBy="cliente")
	private List<Plantilla> plantillas;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_ocupacion")
	private Ocupacion ocupacion;
	
	public Cliente() {
	}
	
	public Cliente(Integer idCliente, String nombre, String apellidoPaterno, String apellidoMaterno, String sexo,
			String correo, String contraseña, Integer edad, boolean enabled, List<Rol> roles, List<Contacto> contactos,
			List<Plantilla> plantillas, Ocupacion ocupacion) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sexo = sexo;
		this.correo = correo;
		this.contraseña = contraseña;
		this.edad = edad;
		this.enabled = enabled;
		this.roles = roles;
		this.contactos = contactos;
		this.plantillas = plantillas;
		this.ocupacion = ocupacion;
	}

	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public List<Rol> getRoles() {
		return roles;
	}


	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}


	public List<Plantilla> getPlantillas() {
		return plantillas;
	}


	public void setPlantillas(List<Plantilla> plantillas) {
		this.plantillas = plantillas;
	}


	public Ocupacion getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}

	public List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
