package com.crts.app.sme.main.serviceI;

import java.util.List;

import com.crts.app.sme.main.model.Lead;

public interface LeadServiceI {
	public void saveLead(Lead lead);
	public Iterable<Lead> getLead();
	public List<Lead> cmLead();
}
