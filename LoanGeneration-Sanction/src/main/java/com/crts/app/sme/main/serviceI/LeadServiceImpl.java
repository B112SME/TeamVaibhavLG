package com.crts.app.sme.main.serviceI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.Lead;
import com.crts.app.sme.main.repository.LeadRepositroy;
@Service
public class LeadServiceImpl implements LeadServiceI{

	@Autowired
	LeadRepositroy lr;
	@Override
	public void saveLead(Lead lead) {
		// TODO Auto-generated method stub
		lr.save(lead);
	}

	@Override
	public Iterable<Lead> getLead() {
		
		List<Lead>list=lr.findAll();
		List<Lead> lead=new ArrayList<Lead>();
		
		for (Lead l : list) 
		{
			if(l.getStatusCode()==102 || l.getStatusCode()==103)
			{
				
				lead.add(l);
			}
			
			
		}
				
		return lead;
	}

	@Override
	public List<Lead> cmLead()
	{
		List<Lead>list=lr.findAll();
		List<Lead> lead=new ArrayList<Lead>();
		
		for (Lead l : list)
		{
			if(l.getCibilStatus().contentEquals("approved"))
			{
				lead.add(l);
			}
		}
		
		return lead;
	}

}
