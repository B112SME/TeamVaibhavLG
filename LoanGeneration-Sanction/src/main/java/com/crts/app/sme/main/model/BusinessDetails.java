package com.crts.app.sme.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BusinessDetails
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int businessId;
	private	String businessType;
	private	String businessName;
	private String businessCertificateNo;
	@OneToOne(cascade = CascadeType.ALL)
	private	Address businessAddress;
	private byte[] businessProof;
	private byte[] businessPanCard;
	private byte[] businessLicianceNo;
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessCertificateNo() {
		return businessCertificateNo;
	}
	public void setBusinessCertificateNo(String businessCertificateNo) {
		this.businessCertificateNo = businessCertificateNo;
	}
	public Address getBusinessAddress() {
		return businessAddress;
	}
	public void setBusinessAddress(Address businessAddress) {
		this.businessAddress = businessAddress;
	}
	public byte[] getBusinessProof() {
		return businessProof;
	}
	public void setBusinessProof(byte[] businessProof) {
		this.businessProof = businessProof;
	}
	public byte[] getBusinessPanCard() {
		return businessPanCard;
	}
	public void setBusinessPanCard(byte[] businessPanCard) {
		this.businessPanCard = businessPanCard;
	}
	public byte[] getBusinessLicianceNo() {
		return businessLicianceNo;
	}
	public void setBusinessLicianceNo(byte[] businessLicianceNo) {
		this.businessLicianceNo = businessLicianceNo;
	}
	
}
