package com.crts.app.LoanGenerationSanction.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanPaymentDetails {
	@Id
	private int lid;
	private int loanId;
	private double paymentAmount;
	private String remark;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
