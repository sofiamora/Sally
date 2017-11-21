package com.quicksoft.sally.service.Impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.quicksoft.sally.model.Cliente;
import com.quicksoft.sally.service.LandingService;

@Service("landingService")
public class LandingImpl implements LandingService{
	
	private static final Log logger = LogFactory.getLog(LandingImpl.class);
	
	@Override
	public Cliente registrarCliente() {
		logger.info("registrando un cliente");
		return null;
	}
}
