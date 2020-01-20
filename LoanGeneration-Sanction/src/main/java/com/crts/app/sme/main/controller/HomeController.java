package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.Lead;
import com.crts.app.sme.main.serviceI.ServiceI;
@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired ServiceI si;
	
	@RequestMapping("/getdata")
	public List<Lead> getData()
	{
	List<Lead> list=(List<Lead>) si.getallData();
		return list;
		
	}
	@PostMapping("/postdata")
	public String postData(@RequestBody Lead lead) {
	  si.savedata(lead);
		return "Saved Successfully!";

	}
}
