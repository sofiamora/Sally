package com.quicksoft.sally.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quicksoft.sally.entity.Cliente;
import com.quicksoft.sally.service.ClienteService;


@Controller
@RequestMapping("/sally")
public class LandingController {
	
	public static final String LANDING_VIEW = "landing";
	public static final String LOGIN_VIEW = "login";
	public static final String REGISTRO_VIEW = "registro";
	
	@Autowired
	@Qualifier("clienteService")
	private ClienteService LandingService;
	
	@GetMapping("/inicio")
	public ModelAndView inicio() {
		return new ModelAndView(LANDING_VIEW);
	}
	
	@GetMapping("/login")
	public ModelAndView login() {
		return new ModelAndView(LOGIN_VIEW);
	}
	
	@GetMapping("/registro")
	public ModelAndView registro() {
		Cliente cliente = new Cliente();
		LandingService.registrarCliente(cliente);
		return new ModelAndView(REGISTRO_VIEW);
	}
}