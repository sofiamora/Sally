package com.quicksoft.sally.model;

import java.util.Date;

public class Cupon {
	private Date vigencia;
	public Cupon() {
		super();
	}
	public Cupon(Date vigencia) {
		super();
		this.vigencia = vigencia;
	}

	public Date getVigencia() {
		return vigencia;
	}

	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}
	
}
