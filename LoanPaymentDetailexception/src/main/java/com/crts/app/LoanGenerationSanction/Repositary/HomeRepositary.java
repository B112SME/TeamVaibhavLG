package com.crts.app.LoanGenerationSanction.Repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.LoanGenerationSanction.Model.LoanPaymentDetails;
@Repository
public interface HomeRepositary extends CrudRepository<LoanPaymentDetails, Integer> {

}
