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

import com.quicksoft.sally.constants.Constants;
import com.quicksoft.sally.converter.ClienteConverter;
import com.quicksoft.sally.entity.Cliente;
import com.quicksoft.sally.model.ClienteModel;
import com.quicksoft.sally.service.ClienteService;


@Controller
@RequestMapping("/sally")
public class LandingController {
	
	private static final Log logger = LogFactory.getLog(LandingController.class);
	private int registroExitoso;
	
	@Autowired
	@Qualifier("clienteService")
	private ClienteService clienteService;
	
	@Autowired
	@Qualifier("clienteConverter")
	private ClienteConverter clienteConverter;
	
	@GetMapping("/inicio")
	public ModelAndView inicio() {
		return new ModelAndView(Constants.LANDING_VIEW);
	}
	
	@GetMapping("/login")
	public ModelAndView login(Model model, 
			@RequestParam(name="error", required=false)String error,
			@RequestParam(name="logout", required=false)String logout) {
		model.addAttribute("clienteLogin", new ClienteModel());
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		model.addAttribute("success", registroExitoso);
		registroExitoso=Constants.MSG_DEFAULT;
		return new ModelAndView(Constants.LOGIN_VIEW);
	}
	
	@GetMapping("/autenticacion")
	public String loginPost() {
		System.out.println("correcto");
		return "redirect:/dashboard";
	}
	
	@GetMapping("/registro")
	public ModelAndView formularioCliente(Model model, @RequestParam(name="error", required=false)String error) {
		model.addAttribute("clienteRegistro",new ClienteModel());
		model.addAttribute("error", error);
		return new ModelAndView(Constants.REGISTRO_VIEW);
	}
	
	@PostMapping("/cliente")
	public String registrarCliente(@ModelAttribute("clienteRegistro")ClienteModel clienteModel){
		String redirect;
		Cliente cliente = clienteConverter.modelToEntity(clienteModel);
		cliente = clienteService.registrarCliente(cliente);
		if(cliente!=null) {
			clienteService.notificarRegistro(cliente);
			registroExitoso=Constants.MSG_EXITO;
			redirect = Constants.LOGIN_VIEW;
			logger.info("Registrando a: "+clienteModel.getCorreo());
		}else{
			registroExitoso=Constants.MSG_DEFAULT;
			redirect = Constants.REGISTRO_VIEW+"?error";
		}
		return "redirect:/sally/"+redirect;
	}
}