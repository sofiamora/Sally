package com.quicksoft.sally.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="compra")
public class Compra {
	
	@EmbeddedId
	private CompraId compraId;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="referencia")
	private String referencia;
	
	@Column(name="monto")
	private Double monto;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="customerId")
	private String customerId;
	
	@Column(name="paymentId")
	private String paymentId;
	
	@OneToOne(fetch=FetchType.EAGER)
	@Column(name="id_tipoPago")
	private TipoPago tipoPago;
	
	@OneToOne(fetch=FetchType.EAGER)
	@Column(name="id_moneda")
	private Moneda moneda;
}
