package com.crts.app.sme.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.User;
import com.crts.app.sme.main.repository.LoanGeneration;
import com.crts.app.sme.main.serviceI.HomeService;
@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired

	LoanGeneration lg;

	@Override
	public void savedata(User user) 
	{

		lg.save(user);
		
	}
	

}
