package com.crts.app.sme.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.Cibil;

@Repository("Cibil")
public interface CibilRepository extends JpaRepository<Cibil, Integer> {
	
	
}
