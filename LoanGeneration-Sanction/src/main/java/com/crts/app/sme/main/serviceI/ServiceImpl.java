package com.crts.app.sme.main.serviceI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.Lead;
import com.crts.app.sme.main.repository.HomeRepository;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	HomeRepository hr;
	
	
	@Override
	public void savedata(Lead lead) {
		hr.save(lead);
		
	}

	@Override
	public Iterable<Lead> getallData() {
		
		return hr.findAll();
	}

}
