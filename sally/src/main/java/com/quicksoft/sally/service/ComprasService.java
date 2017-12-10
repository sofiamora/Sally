package com.quicksoft.sally.service;

import java.util.List;

import com.quicksoft.sally.entity.Cliente;
import com.quicksoft.sally.entity.Plantilla;
import com.quicksoft.sally.model.CompraModel;

public interface ComprasService {
	public abstract List<CompraModel> getListCompras();
	public abstract List<CompraModel> getListVentas();
	public abstract Plantilla comprarPlantilla(Cliente cliente, Plantilla plantilla);
}
