package com.crts.app.LoanGenrationandSanction.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.LoanGenrationandSanction.Model.LoanType;
import com.crts.app.LoanGenrationandSanction.Service.HomeService;

@RestController
public class HomeController
{
@Autowired
HomeService hs;
@RequestMapping("/savedata")
public void saveuser(@RequestBody LoanType LT)
{
	hs.savedata(LT);
}
@GetMapping("/getLoanType")
public List<LoanType> getLoanTypeDetails(){
	
	return hs.getData();
}
}
