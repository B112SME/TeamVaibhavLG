package com.crts.app.LoanGenrationandSanction.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.LoanGenrationandSanction.Model.LoanType;

@Repository
public interface LoanRepository extends CrudRepository<LoanType, String> 
{

}
