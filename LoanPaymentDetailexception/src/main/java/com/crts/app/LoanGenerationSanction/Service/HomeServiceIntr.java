package com.crts.app.LoanGenerationSanction.Service;

import java.util.List;
import java.util.Optional;

import com.crts.app.LoanGenerationSanction.Model.LoanPaymentDetails;

public interface HomeServiceIntr {
	
	
	public void save(LoanPaymentDetails p);

	
	public Optional<LoanPaymentDetails> getData(int lid);


}
