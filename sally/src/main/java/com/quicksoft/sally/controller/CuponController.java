package com.quicksoft.sally.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quicksoft.sally.service.CuponService;

@Controller
@RequestMapping("/cupon")
public class CuponController {
	@Autowired
	@Qualifier("cuponService")
	private CuponService cuponService;
}
