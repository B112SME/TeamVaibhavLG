package com.crts.app.sme.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	@Id
	private int branchId;
	private String branchName;
	private String branchType;
	private String ifscCode;
	private long micrCode;
	private int branchCode;
	private long branchContactno;
	private String branchEmailid;
	@OneToOne(cascade=CascadeType.ALL)
	private Address branchAddress;

}
