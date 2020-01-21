package com.crts.app.LoanGenerationSanction.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.tomcat.jni.Address;

@Entity
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	//@OneToOne
	//private GuarantorDetails guarantorId;
	private String customerName;
	private String customerMobileNo;
	private String customerAddress;
	private String customerEmailId;
	private String customerGender;
	private String customerDob;
	private int customerAge;
	private String customerProfession;
	private String policeStation;
	private String residenceType;
	//@OneToMany(cascade=CascadeType.ALL)
	//private List<Address> customerLaddress;
	
	//@OneToMany(cascade=CascadeType.ALL)
	//private List<Address> customerPaddress;
	
	private String maritalStatus;
	private int loanNo;
	//@OneToOne
	//private Lead leadId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/*
	 * public GuarantorDetails getGuarantorId() { return guarantorId; } public void
	 * setGuarantorId(GuarantorDetails guarantorId) { this.guarantorId =
	 * guarantorId; }
	 */
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMobileNo() {
		return customerMobileNo;
	}
	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	
	  public String getCustomerGender() { return customerGender; } public void
	  setCustomerGender(String customerGender) { this.customerGender =
	  customerGender; }
	 
	public String getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerProfession() {
		return customerProfession;
	}
	public void setCustomerProfession(String customerProfession) {
		this.customerProfession = customerProfession;
	}
	public String getPoliceStation() {
		return policeStation;
	}
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}
	public String getResidenceType() {
		return residenceType;
	}
	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
	}

	/*
	 * public List<Address> getCustomerLaddress() { return customerLaddress; }
	 * public void setCustomerLaddress(List<Address> customerLaddress) {
	 * this.customerLaddress = customerLaddress; } public List<Address>
	 * getCustomerPaddress() { return customerPaddress; } public void
	 * setCustomerPaddress(List<Address> customerPaddress) { this.customerPaddress =
	 * customerPaddress; }
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	/*
	 * public Lead getLeadId() { return leadId; } public void setLeadId(Lead leadId)
	 * { this.leadId = leadId; }
	 */
	
}
