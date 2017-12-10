package com.quicksoft.sally.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.quicksoft.sally.service.DashboardService;

@Controller
public class DashboardController {
	
	private static final String DASHBOARD_VIEW = "base";
	
	@Autowired
	@Qualifier("dashboardService")
	private DashboardService dashboardService;
	
	@GetMapping("/dashboard")
	public ModelAndView mostrarDashboard() {
		ModelAndView mov = new ModelAndView(DASHBOARD_VIEW);
		User clienteActivo = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		mov.addObject("nombre",clienteActivo.getUsername());
		return mov;
	}
}
