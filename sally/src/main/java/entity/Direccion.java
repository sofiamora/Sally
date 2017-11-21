package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="direccion")
public class Direccion {
	@Id
	@GeneratedValue
	@Column(name="id_direccion")
	private Integer idDireccion;
	
	@Column(name="calle")
	private String calle;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="colonia")
	private String colonia;
	
	@Column(name="codigoP")
	private String cp;
	
	@Column(name="estatus")
	private Integer estatus;
	
	/*Mapeo One To One el que recibe la llave foranea es el que especifica el mapeo*/
	@OneToOne(fetch=FetchType.EAGER)
	@Column(name="id_cliente")
	private Cliente cliente;
	
	public Direccion() {
		
	}
	
	public Direccion(Integer idDireccion, String calle, String ciudad, String pais, String estado, String colonia,
			String cp, Integer estatus, Cliente cliente) {
		super();
		this.idDireccion = idDireccion;
		this.calle = calle;
		this.ciudad = ciudad;
		this.pais = pais;
		this.estado = estado;
		this.colonia = colonia;
		this.cp = cp;
		this.estatus = estatus;
		this.cliente = cliente;
	}

	public Integer getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
