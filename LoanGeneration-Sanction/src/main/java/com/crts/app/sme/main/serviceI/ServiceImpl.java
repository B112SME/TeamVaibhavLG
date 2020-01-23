package com.crts.app.sme.main.serviceI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.dto.LeadDto;
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

	@Override
	public void savedataDto(LeadDto leadto) {
		
	ModelMapper mp=new ModelMapper();
	
Lead mylead=mp.map(leadto, Lead.class);
	hr.save(mylead);
	
	}

	@Override
	public List<LeadDto> getallDataDto() {
		List<Lead> list=(List<Lead>) hr.findAll();
		List<LeadDto> lidto=new ArrayList<LeadDto>();
		ModelMapper mp=new ModelMapper();
		for (Lead lead : list) {
			LeadDto ld=mp.map(lead, LeadDto.class);
			lidto.add(ld);
		}
		return lidto;
	}

	@Override
	public Optional<Lead> getLead(int leadId) {
		
		return hr.findById(leadId);
		 
	}

	@Override
	public void deleteLead(int leadId) {
		hr.deleteById(leadId);
		
	}

}
