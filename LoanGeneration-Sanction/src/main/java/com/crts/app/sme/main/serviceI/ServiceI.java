package com.crts.app.sme.main.serviceI;

import com.crts.app.sme.main.model.Lead;

public interface ServiceI {
	public void savedata(Lead lead);
	public Iterable<Lead> getallData();
}
