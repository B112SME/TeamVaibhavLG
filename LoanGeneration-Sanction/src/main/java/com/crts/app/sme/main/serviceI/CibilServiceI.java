package com.crts.app.sme.main.serviceI;

import java.util.List;

import com.crts.app.sme.main.model.Cibil;

public interface CibilServiceI {

	public void saveCibil(Cibil c);
	public List<Cibil> getCibil();
}
