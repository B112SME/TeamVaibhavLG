package com.crts.app.LoanGenerationSanction.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crts.app.LoanGenerationSanction.Model.LoanPaymentDetails;
import com.crts.app.LoanGenerationSanction.Repositary.HomeRepositary;


@Service
public class HomeServiceImpl implements HomeServiceIntr {
	@Autowired
	HomeRepositary hr;
	

	@Override
	public void save(LoanPaymentDetails p) {
		hr.save(p);
		
	}

	

//	public LoanPaymentDetails getid(LoanPaymentDetails lid) {
//		// TODO Auto-generated method stub
//		return null;
//	}



	@Override
	public Optional<LoanPaymentDetails> getData(int lid) {

		
		
		return hr.findById(lid);
	

	
	}
}
