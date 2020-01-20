package com.crts.app.sme.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.Cibil;
import com.crts.app.sme.main.service.ServiceI;

@RestController
public class HomeController {
	
	@Autowired
	ServiceI si;

	@RequestMapping("/reg")
	public String register(@RequestBody Cibil c)
	{
		si.registerCibil(c);
		return "saved";
	}
	
}
