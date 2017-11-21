package com.quicksoft.sally.service;

import java.util.List;

import com.quicksoft.sally.model.Plantilla;

public interface DashboardService {
	public abstract List<Plantilla> getRecomendaciones();
}
