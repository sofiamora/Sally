package com.quicksoft.sally.service;

import java.util.List;

import com.quicksoft.sally.model.Compra;

public interface ComprasService {
	public abstract List<Compra> getListCompras();
	public abstract List<Compra> getListVentas();
}
