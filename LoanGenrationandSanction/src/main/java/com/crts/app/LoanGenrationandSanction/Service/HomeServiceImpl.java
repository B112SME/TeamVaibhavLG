package com.crts.app.LoanGenrationandSanction.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.LoanGenrationandSanction.Model.LoanType;
import com.crts.app.LoanGenrationandSanction.Repository.LoanRepository;
@Service
public class HomeServiceImpl implements HomeService
{
@Autowired
LoanRepository lr;
	@Override
	public void savedata(LoanType lt)
	{
		lr.save(lt);
		
	}

	@Override
	public List<LoanType> getData() {
		return (List<LoanType>) lr.findAll();
		
	}

}
