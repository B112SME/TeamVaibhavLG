package com.crts.app.LoanGenerationSanction.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.LoanGenerationSanction.Model.CustomerDetails;
import com.crts.app.LoanGenerationSanction.Service.HomeService;
@RestController
public class HomeController 
{
	@Autowired
	HomeService hs;

	@RequestMapping("/saveuser")
	public void saveuser(@RequestBody CustomerDetails customer)
	{
		hs.savedata(customer);
	}
	
	@GetMapping("/getcustomer")
	public List<CustomerDetails> getCustomerDetails(){
		
		return hs.getData();
	}

	}
	

