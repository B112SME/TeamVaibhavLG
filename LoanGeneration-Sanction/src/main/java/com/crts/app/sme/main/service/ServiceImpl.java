package com.crts.app.sme.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.Cibil;
import com.crts.app.sme.main.repository.HomeRepository;

@Service
public class ServiceImpl implements ServiceI{
	
	@Autowired
	HomeRepository hr;

	@Override
	public void registerCibil(Cibil c) {
		
		hr.save(c);
	}

}
