package com.crts.app.sme.main.serviceI;

import java.util.List;
import java.util.Optional;

import com.crts.app.sme.main.dto.LeadDto;
import com.crts.app.sme.main.model.Lead;

public interface ServiceI {
	public void savedata(Lead lead);
	public Iterable<Lead> getallData();
	public void savedataDto(LeadDto leadto);
	public List<LeadDto> getallDataDto();
    public Optional<Lead> getLead(int leadId);
   public void deleteLead(int leadId);

}
