package com.crts.app.sme.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.Lead;

@Repository("Lead")
public interface LeadRepositroy extends JpaRepository<Lead, Integer> {

}
