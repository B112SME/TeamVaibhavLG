package com.crts.app.sme.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.User;
import com.crts.app.sme.main.serviceI.HomeService;
@CrossOrigin("*")
@RestController
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@RequestMapping(value = "/reg",method = RequestMethod.POST)
	public String savedata(@RequestBody User user)
	{
		hs.savedata(user);
		return "success";
	}

}
