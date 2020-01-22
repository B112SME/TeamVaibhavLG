package com.crts.app.sme.main.serviceI;

import java.util.List;

import com.crts.app.sme.main.dto.Dto;
import com.crts.app.sme.main.model.LoanDetails;

public interface HomeService 
{

	void savedata(LoanDetails loandetails);

	List<LoanDetails>getAll(LoanDetails loandetails);

	List<LoanDetails> getdata(int loanId);
	
	List<LoanDetails> removedata(int loanId);
	
	
	public void saveloanDto(Dto dto);
	List<Dto> getDto(Dto dto);

	LoanDetails editdata(int loanid);

	LoanDetails updatedata(LoanDetails loandetails);

	List<LoanDetails> getAlldata(LoanDetails loandetails);


}
