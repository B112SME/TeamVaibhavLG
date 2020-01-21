package com.crts.app.LoanGenerationSanction.Repositary;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.LoanGenerationSanction.Model.CustomerDetails;

@Repository
public interface Homerepositary extends CrudRepository<CustomerDetails, Integer>
	{
		
	

}
