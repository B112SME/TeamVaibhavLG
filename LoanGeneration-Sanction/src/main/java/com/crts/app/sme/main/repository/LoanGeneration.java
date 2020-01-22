package com.crts.app.sme.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.dto.Dto;
import com.crts.app.sme.main.model.LoanDetails;
@Repository
public interface LoanGeneration extends CrudRepository<LoanDetails, Integer>
{

	List<LoanDetails> findByloanId(int loanId);

	void deleteByloanId(int loanId);

	void save(Dto dt);

	LoanDetails findAllByloanId(int loanid);	
	
	List<LoanDetails>findAll();

}
