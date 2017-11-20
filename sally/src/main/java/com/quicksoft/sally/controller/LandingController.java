package com.quicksoft.sally.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sally")
public class LandingController {
	@GetMapping("/inicio")
	public String inicio() {
		return "landing";
	}
}
