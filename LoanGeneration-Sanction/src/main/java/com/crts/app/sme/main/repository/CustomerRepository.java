package com.crts.app.sme.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.CustomerDetails;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerDetails, Integer>{

	
	
	
	
}
