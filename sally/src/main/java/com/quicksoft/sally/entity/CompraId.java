package com.quicksoft.sally.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompraId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="folio")
	private Integer folio;
	
	@Column(name="id_plantilla")
	private Integer idPlantilla;

	public CompraId() {
		
	}
	
	public CompraId(Integer folio, Integer idPlantilla) {
		super();
		this.folio = folio;
		this.idPlantilla = idPlantilla;
	}

	public Integer getFolio() {
		return folio;
	}

	public void setFolio(Integer folio) {
		this.folio = folio;
	}

	public Integer getIdPlantilla() {
		return idPlantilla;
	}

	public void setIdPlantilla(Integer idPlantilla) {
		this.idPlantilla = idPlantilla;
	}
	
}
