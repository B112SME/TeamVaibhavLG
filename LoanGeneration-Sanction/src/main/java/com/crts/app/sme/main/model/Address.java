package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int addressId;
	private String houseNo;
	private String streetName;
	private String	area;
	private String landMark;
	private String taluka;
	private String city;
	private String district;
	private String state;
	private String Country;
	private String pincode;

}
