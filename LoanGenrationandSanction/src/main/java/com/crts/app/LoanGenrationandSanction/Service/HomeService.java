package com.crts.app.LoanGenrationandSanction.Service;

import java.util.List;

import com.crts.app.LoanGenrationandSanction.Model.LoanType;


public interface HomeService
{
public void savedata(LoanType lt);
	
	public List<LoanType> getData();

	
}
