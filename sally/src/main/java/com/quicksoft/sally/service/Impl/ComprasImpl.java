package com.quicksoft.sally.service.Impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.quicksoft.sally.model.Compra;
import com.quicksoft.sally.service.ComprasService;

@Service("comprasService")
public class ComprasImpl implements ComprasService{
	@Override
	public List<Compra> getListCompras() {
		return null;
	}
	@Override
	public List<Compra> getListVentas() {
		// TODO Auto-generated method stub
		return null;
	}
}
