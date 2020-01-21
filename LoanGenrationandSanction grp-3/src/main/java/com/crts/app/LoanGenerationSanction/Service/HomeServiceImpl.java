package com.crts.app.LoanGenerationSanction.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.LoanGenerationSanction.Model.CustomerDetails;
import com.crts.app.LoanGenerationSanction.Repositary.Homerepositary;

@Service
public class HomeServiceImpl implements HomeService{
	
	
	@Autowired
	Homerepositary hr;
	
	
	
	@Override
	public void savedata(CustomerDetails c) {
		hr.save(c);
	}

	
	
	@Override
	public List<CustomerDetails> getData() 
	{
			return (List<CustomerDetails>) hr.findAll();
		
	}



	
	
	
	}


