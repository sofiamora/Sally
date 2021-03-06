package com.quicksoft.sally.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.quicksoft.sally.entity.Cliente;
import com.quicksoft.sally.service.ClienteService;
import com.quicksoft.sally.service.DashboardService;

@Controller
@SessionAttributes("clienteSession")
public class DashboardController {
	
	private static final String DASHBOARD_VIEW = "base";
	public Cliente clienteSession;
	@Autowired
	@Qualifier("dashboardService")
	private DashboardService dashboardService;
	
	@Autowired
	@Qualifier("clienteService")
	private ClienteService clienteService;
	
	@GetMapping("/dashboard")
	public ModelAndView mostrarDashboard(ModelMap model) {
		ModelAndView mov = new ModelAndView(DASHBOARD_VIEW);
		User clienteActivo = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		//Suiendo a session
		if(clienteSession == null) {
			clienteSession = clienteService.buscarCliente(clienteActivo.getUsername());
			if(clienteSession != null) {
				model.put("clienteSession", clienteSession);
			}
		}
		Cliente cli = (Cliente)model.get("clienteSession");
		mov.addObject("nombre",cli.getNombre());
		return mov;
	}
}
