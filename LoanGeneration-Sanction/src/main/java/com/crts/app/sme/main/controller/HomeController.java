package com.crts.app.sme.main.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.dto.Dto;
import com.crts.app.sme.main.exception.LoanIdNotFound;
import com.crts.app.sme.main.model.LoanDetails;
import com.crts.app.sme.main.serviceI.HomeService;
@CrossOrigin("*")
@RestController
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@RequestMapping(value = "/post",method = RequestMethod.POST)
	public String savedata(@RequestBody  LoanDetails loandetails)
	{
		hs.savedata(loandetails);
		return "success";
	}
	
	@RequestMapping(value = "/get",method = RequestMethod.GET)
	public List<LoanDetails>getAlldata(@ModelAttribute("lds")LoanDetails loandetails)
	{
		List<LoanDetails>list=hs.getAll(loandetails);

		return list;
	}
	@RequestMapping(value = "/get/{loanId}",method = RequestMethod.GET)
	public List<LoanDetails> getdata(@PathVariable("loanId") int loanId)  
	{
		List<LoanDetails>lds=hs.getdata(loanId);
		
		return lds;
		
	}
	
	@RequestMapping(value = "remove/{loanId}",method = RequestMethod.DELETE)
	public List<LoanDetails> removedata(@PathVariable("loanId") int loanId)
	{
		List<LoanDetails> list=hs.removedata(loanId);
		
		return list;
	}
	
	@RequestMapping(value = "/savedto",method = RequestMethod.POST)
	public void saveDtoData(@RequestBody Dto dto)
	{
		hs.saveloanDto(dto);
	}

	@RequestMapping(value = "/getdto",method = RequestMethod.GET)
	public List<Dto> getDtoData(@ModelAttribute("dt")Dto dto)
	{
		
		List<Dto>list=hs.getDto(dto);
		return list;
	}
	@RequestMapping(value = "/edit/{loanid}",method = RequestMethod.GET)
	public LoanDetails editdata(@PathVariable int loanid,@ModelAttribute("ld") LoanDetails loandetails)
	{
		return hs.editdata(loanid);
	}
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public LoanDetails updatedata(@RequestBody LoanDetails loandetails)
	{
		hs.updatedata(loandetails);
		List<LoanDetails> list=hs.getAlldata(loandetails);
		return (LoanDetails) list;
	}
	
	  @RequestMapping("/id/{loanid}") 
	  Optional<LoanDetails> getloan(@PathVariable int loanid) throws LoanIdNotFound
	  {
	  Optional<LoanDetails> op=hs.getloandata(loanid); 
	  if(op.isPresent()) { return
	  op; 
	  }
	  else 
	  {
		  throw new LoanIdNotFound();
	  }
	  
	}
	


}
