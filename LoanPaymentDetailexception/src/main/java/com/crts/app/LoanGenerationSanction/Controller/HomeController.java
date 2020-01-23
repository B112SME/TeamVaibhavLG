package com.crts.app.LoanGenerationSanction.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.LoanGenerationSanction.Exception.CustomerNotFound;

import com.crts.app.LoanGenerationSanction.Model.LoanPaymentDetails;

import com.crts.app.LoanGenerationSanction.Service.HomeServiceImpl;


@RestController
public class HomeController {
	@Autowired
	HomeServiceImpl hs;

	@RequestMapping("/savepayment")
	public void save(@RequestBody LoanPaymentDetails payment)
	{
		hs.save(payment);
	}
	
	/*
	 * @GetMapping("/getpaymentDetails") public List<LoanPaymentDetails>
	 * getPaymentDetails(){
	 * 
	 * return hs.getData(0); }
	 */
	 @RequestMapping("/getid/{lid}") 
	 public Optional<LoanPaymentDetails> getloanpay(@PathVariable int lid) throws CustomerNotFound { 
		
		Optional <LoanPaymentDetails> opp=hs.getData(lid);
		System.out.println( lid); 
		if(opp.isPresent()) 
		{ 
			return opp; 
		}
		else 
		{ 
			throw new CustomerNotFound(); 
		}	 
	 }
	 }
