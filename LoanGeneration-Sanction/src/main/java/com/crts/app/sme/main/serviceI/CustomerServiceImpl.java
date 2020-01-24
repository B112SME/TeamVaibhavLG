package com.crts.app.sme.main.serviceI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.CustomerDetails;
import com.crts.app.sme.main.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository cr;
	
	
	@Override
	public List<CustomerDetails> getData() {
		
		return (List<CustomerDetails>) cr.findAll();
	}

}
