package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PreviousLoanDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private Branch branch;
	private int remainingEmi;
	private double remainingAmount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 public Branch getBranch() { return branch; } public void setBranch(Branch
	 branch) { this.branch = branch; }
	
	public int getRemainingEmi() {
		return remainingEmi;
	}
	public void setRemainingEmi(int remainingEmi) {
		this.remainingEmi = remainingEmi;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	
	
	

}
