package com.crts.app.sme.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.dto.Dto;
import com.crts.app.sme.main.model.LoanDetails;
import com.crts.app.sme.main.repository.LoanGeneration;
import com.crts.app.sme.main.serviceI.HomeService;
@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired

	LoanGeneration lg;

	@Override
	public void savedata(LoanDetails loandetails) 
	{

		lg.save(loandetails);
		
	}

	@Override
	public List<LoanDetails> getAll(LoanDetails loandetails) {

		List<LoanDetails>list=(List<LoanDetails>) lg.findAll();
		return list;
	}

	@Override
	public List<LoanDetails> getdata(int loanId)
	{
		List<LoanDetails> lds=lg.findByloanId(loanId);
		return lds;
	}

	@Override
	public List<LoanDetails> removedata(int loanId) {

		lg.deleteById(loanId);
		
		return (List<LoanDetails>) lg.findAll();
	}
	
	@Override
	public void saveloanDto(Dto dto) {
		
		ModelMapper m=new ModelMapper();
		LoanDetails ld=m.map(dto,LoanDetails.class);
		   lg.save(ld);
		
	}

	@Override
	public List<Dto> getDto(Dto dto) 
	{
		List<LoanDetails>list=(List<LoanDetails>) lg.findAll();
		
		List<Dto>dtlist=new ArrayList<Dto>();
		ModelMapper mp=new ModelMapper();
		for(LoanDetails ld:list)
		{
			Dto d=mp.map(ld, Dto.class);
			dtlist.add(d);
		}
		
		return dtlist;
	}

	@Override
	public LoanDetails editdata(int loanid) {

		return lg.findAllByloanId(loanid);
	}

	@Override
	public LoanDetails updatedata(LoanDetails loandetails) {
		return lg.save(loandetails);
	}

	@Override
	public List<LoanDetails> getAlldata(LoanDetails loandetails) {

		return (List<LoanDetails>) lg.findAll();
	}
	
	
	 
	

}
