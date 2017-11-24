package com.quicksoft.sally.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quicksoft.sally.service.ClienteService;

@Controller
@RequestMapping("/perfil")
public class ClienteController {
	@Autowired
	@Qualifier("clienteService")
	private ClienteService perfilService;
	
}
