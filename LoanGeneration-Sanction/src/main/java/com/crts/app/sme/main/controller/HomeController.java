package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.Cibil;
import com.crts.app.sme.main.model.CustomerDetails;
import com.crts.app.sme.main.model.Lead;
import com.crts.app.sme.main.serviceI.CibilServiceI;
import com.crts.app.sme.main.serviceI.CustomerService;
import com.crts.app.sme.main.serviceI.LeadServiceI;

@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	CibilServiceI si;
	@Autowired
	LeadServiceI li;
	@Autowired
	CustomerService ci;
	
	  @RequestMapping("/getlead") 
	  public List<Lead> getData() 
	  { 
	
		  List<Lead> list=(List<Lead>) li.getLead();
		  return list;
	  
	  }
	  
	  @PostMapping("/setlead") 
	  public String postData(@RequestBody Lead lead) {
	  li.saveLead(lead); return "Saved Successfully!";
	  
	  }
	 
	@PostMapping(value = "/setcibil" )
	public String register(@RequestBody Cibil c)
	{
		System.out.println("setcibil");
		System.out.println(c);
		si.saveCibil(c);
		return "saved";
	}
	@RequestMapping("/getcibil")
	public List<Cibil> postData() {
	  
		return si.getCibil();

	}
	
	@RequestMapping("/appLead")
	public List<Lead> cmLead()
	{
		return li.cmLead();
	}
	
	@RequestMapping("/getcustomer")
	public List<CustomerDetails> getCustomerDetails(){
		
		return ci.getData();
	}
	
}
