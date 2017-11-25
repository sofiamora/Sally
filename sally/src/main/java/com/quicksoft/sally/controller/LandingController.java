package com.quicksoft.sally.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.quicksoft.sally.converter.ClienteConverter;
import com.quicksoft.sally.entity.Cliente;
import com.quicksoft.sally.model.ClienteModel;
import com.quicksoft.sally.service.ClienteService;


@Controller
@RequestMapping("/sally")
public class LandingController {
	
	public static final String LANDING_VIEW = "landing";
	public static final String LOGIN_VIEW = "login";
	public static final String REGISTRO_VIEW = "registro";
	private static final String DASHBOARD_VIEW = "dashboard";
	
	private static final Log logger = LogFactory.getLog(LandingController.class);
	
	@Autowired
	@Qualifier("clienteService")
	private ClienteService clienteService;
	
	@Autowired
	@Qualifier("clienteConverter")
	private ClienteConverter clienteConverter;
	
	@GetMapping("/inicio")
	public ModelAndView inicio() {
		return new ModelAndView(LANDING_VIEW);
	}
	
	@GetMapping("/login")
	public ModelAndView login(Model model, 
			@RequestParam(name="error", required=false)String error,
			@RequestParam(name="logout", required=false)String logout) {
		model.addAttribute("clienteLogin", new ClienteModel());
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		return new ModelAndView(LOGIN_VIEW);
	}
	
	@PostMapping("/login")
	public String loginPost(@ModelAttribute("clienteLogin")ClienteModel clienteModel) {
		String redirect;
		Cliente cliente = clienteService.login(clienteModel.getCorreo(),clienteModel.getContraseña());
		if(cliente!=null) {
			redirect = DASHBOARD_VIEW;
		}else {
			redirect = "sally/"+LOGIN_VIEW+"?error";
		}
		return "redirect:/"+redirect;
	}
	
	@GetMapping("/registro")
	public ModelAndView formularioCliente(Model model) {
		model.addAttribute("clienteRegistro",new ClienteModel());
		return new ModelAndView(REGISTRO_VIEW);
	}
	
	@PostMapping("/cliente")
	public String registrarCliente(@ModelAttribute("clienteRegistro")ClienteModel clienteModel){
		Cliente cliente = clienteConverter.modelToEntity(clienteModel);
		logger.info("Registrando a: "+clienteModel.getCorreo());
		clienteService.registrarCliente(cliente);
		return "redirect:/sally/"+LOGIN_VIEW;
	}
}