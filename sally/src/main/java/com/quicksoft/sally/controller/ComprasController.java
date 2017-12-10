package com.quicksoft.sally.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quicksoft.sally.service.ComprasService;

@Controller
@RequestMapping("/compras")
public class ComprasController {
	@Autowired
	@Qualifier("comprasService")
	private ComprasService comprasService;
	
}
