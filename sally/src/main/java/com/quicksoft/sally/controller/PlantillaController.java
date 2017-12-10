package com.quicksoft.sally.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quicksoft.sally.constants.Constants;
import com.quicksoft.sally.service.PlantillaService;

@Controller
@RequestMapping("/plantilla")
public class PlantillaController {
	@Autowired
	@Qualifier("plantillaService")
	private PlantillaService plantillaService;
	
	@GetMapping("/compra")
	public ModelAndView comprar(Model model) {
		
		return new ModelAndView(Constants.TARJETA_VIEW);
	}
}
