package com.quicksoft.sally.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quicksoft.sally.constants.Constants;
import com.quicksoft.sally.service.MetodosPagoService;

@Controller
@RequestMapping("/pagos")
public class MetodosPagoController {
	@Autowired
	@Qualifier("metodoPagoService")
	private MetodosPagoService metodosPagoService;
	
	@GetMapping("/add")
	public ModelAndView agregarMetodo() {
		return new ModelAndView(Constants.AGREGAR_PAGO);
	}
}
