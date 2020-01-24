package com.crts.app.sme.main.serviceI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.Cibil;
import com.crts.app.sme.main.repository.CibilRepository;
import com.crts.app.sme.main.repository.LeadRepositroy;

@Service
public class CibilServiceImpl implements CibilServiceI {

	@Autowired
	CibilRepository cr;
	LeadRepositroy lr;

	
	 
	@Override
	public void saveCibil(Cibil c) 
	{
		
		System.out.println(c);
		cr.save(c);
		
	}

	@Override
	public List<Cibil> getCibil() {
		
		return (List<Cibil>) cr.findAll();
	}

}
