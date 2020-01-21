package com.crts.app.LoanGenerationSanction.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
public class Lead {
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int leadId;
	//@OneToOne
	//private Enquiry enquiryId;
	private String customerAdharcard;
	private String customerPancard;
	private long customerAdharno;
	private String customerPanno;
	private String date;
	private String status;
	private String lastDateAndTime;
	public int getLeadId() {
		return leadId;
	}
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}

	/*
	 * public Enquiry getEnquiryId() { return enquiryId; } public void
	 * setEnquiryId(Enquiry enquiryId) { this.enquiryId = enquiryId; }
	 */
	public String getCustomerAdharcard() {
		return customerAdharcard;
	}
	public void setCustomerAdharcard(String customerAdharcard) {
		this.customerAdharcard = customerAdharcard;
	}
	public String getCustomerPancard() {
		return customerPancard;
	}
	public void setCustomerPancard(String customerPancard) {
		this.customerPancard = customerPancard;
	}
	public long getCustomerAdharno() {
		return customerAdharno;
	}
	public void setCustomerAdharno(long customerAdharno) {
		this.customerAdharno = customerAdharno;
	}
	public String getCustomerPanno() {
		return customerPanno;
	}
	public void setCustomerPanno(String customerPanno) {
		this.customerPanno = customerPanno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLastDateAndTime() {
		return lastDateAndTime;
	}
	public void setLastDateAndTime(String lastDateAndTime) {
		this.lastDateAndTime = lastDateAndTime;
	}
	
	

}
