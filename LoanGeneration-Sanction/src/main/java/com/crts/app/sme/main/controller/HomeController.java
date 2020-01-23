package com.crts.app.sme.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.dto.LeadDto;
import com.crts.app.sme.main.exception.LeadIdNotFound;
import com.crts.app.sme.main.model.Lead;
import com.crts.app.sme.main.serviceI.ServiceI;
@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired ServiceI si;
	
	@RequestMapping("/getdata")
	public List<Lead> getData()
	{
	List<Lead> list=(List<Lead>) si.getallData();
		return list;
		
	}
	@PostMapping("/postdata")
	public String postData(@RequestBody Lead lead) {
	  si.savedata(lead);
		return "Saved Successfully!";

	}
	@PostMapping("/postdto")
	public String saveDto(@RequestBody LeadDto ld)
	{
	       si.savedataDto(ld);
	       return"Success";
	}
	
	@GetMapping("/getdto")
	public List<LeadDto> getMydto()
	{
	List<LeadDto> ldt=	si.getallDataDto();
		return ldt;
		
	}
	@RequestMapping("/id/{leadId}")
	public Optional<Lead> mylead(@PathVariable int leadId) throws LeadIdNotFound
	{
			Optional<Lead> oppt= si.getLead(leadId);
			System.out.println(oppt);
			if(oppt.isPresent())
			{
				return oppt;
			}
			else
			{
				throw new LeadIdNotFound();
			}	
	}
	@RequestMapping("/del/{leadId}")
	public String deleteIt(@PathVariable int leadId)
	{
		si.deleteLead(leadId);
			return "Deleted Successfully!";
	
			}
}
