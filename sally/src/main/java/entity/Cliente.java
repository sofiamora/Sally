package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="contraseña")
	private String contraseña;
	
	@Column(name="edad")
	private Integer edad;
	
	@OneToOne(fetch=FetchType.EAGER)
	@Column(name="id_rol")
	private Rol rol;
	
	@OneToOne(fetch=FetchType.EAGER)
	@Column(name="id_ocupacion")
	private Ocupacion ocupacion;
	
	public Cliente() {
	}
	
	public Cliente(Integer idCliente, String nombre, String apellidoPaterno, String apellidoMaterno, String sexo,
			String correo, String contraseña, Integer edad, Rol rol, Ocupacion ocupacion) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sexo = sexo;
		this.correo = correo;
		this.contraseña = contraseña;
		this.edad = edad;
		this.rol = rol;
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
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Ocupacion getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}
	
		
	
}
