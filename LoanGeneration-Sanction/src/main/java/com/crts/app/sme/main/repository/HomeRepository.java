package com.crts.app.sme.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.crts.app.sme.main.model.Cibil;

public interface HomeRepository extends CrudRepository<Cibil, Integer>{
	
	public List<Cibil> findAll();

}
