package com.quicksoft.sally.service;

import java.util.List;

import com.quicksoft.sally.model.Plantilla;
import com.quicksoft.sally.model.Solucion;

public interface ResultadoService {
	public abstract List<Solucion> getResultados(Plantilla plantilla);
}
