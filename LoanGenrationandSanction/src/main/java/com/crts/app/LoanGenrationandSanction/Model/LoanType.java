package com.crts.app.LoanGenrationandSanction.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class LoanType
{
	@Id
	private int ltid;
	private String loanType;
	private String loanCode;
	public int getLtid() {
		return ltid;
	}
	public void setLtid(int ltid) {
		this.ltid = ltid;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanCode() {
		return loanCode;
	}
	public void setLoanCode(String loanCode) {
		this.loanCode = loanCode;
	}
	
}
