package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class GaurantorDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int guarantorId;
	private String guarantorName;
	private String guarantorMobileNo;
	//private Address guarantorAddress;
	private String guarantorEmailId;
	private String guarantorGender;
	private String guarantorDob;
	private int guarantorAge;
	private String guarantorProfession;
	private String policeStation;
	private String residenceType;
	private String maritalStatus;
//	@OneToMany
//	private PrviousLoanDetails loandetails;
	private String dateTime;
	
	public int getGuarantorId() {
		return guarantorId;
	}
	public void setGuarantorId(int guarantorId) {
		this.guarantorId = guarantorId;
	}
	public String getGuarantorName() {
		return guarantorName;
	}
	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}
	public String getGuarantorMobileNo() {
		return guarantorMobileNo;
	}
	public void setGuarantorMobileNo(String guarantorMobileNo) {
		this.guarantorMobileNo = guarantorMobileNo;
	}
//	public Address getGuarantorAddress() {
//		return guarantorAddress;
//	}
//	public void setGuarantorAddress(Address guarantorAddress) {
//		this.guarantorAddress = guarantorAddress;
//	}
	public String getGuarantorEmailId() {
		return guarantorEmailId;
	}
	public void setGuarantorEmailId(String guarantorEmailId) {
		this.guarantorEmailId = guarantorEmailId;
	}
	public String getGuarantorGender() {
		return guarantorGender;
	}
	public void setGuarantorGender(String guarantorGender) {
		this.guarantorGender = guarantorGender;
	}
	public String getGuarantorDob() {
		return guarantorDob;
	}
	public void setGuarantorDob(String guarantorDob) {
		this.guarantorDob = guarantorDob;
	}
	public int getGuarantorAge() {
		return guarantorAge;
	}
	public void setGuarantorAge(int guarantorAge) {
		this.guarantorAge = guarantorAge;
	}
	public String getGuarantorProfession() {
		return guarantorProfession;
	}
	public void setGuarantorProfession(String guarantorProfession) {
		this.guarantorProfession = guarantorProfession;
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
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	
//	 public PrviousLoanDetails getLoandetails() { return loandetails; } public
//	 void setLoandetails(PrviousLoanDetails loandetails) { this.loandetails =
//	 loandetails; }
//	
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	

}
