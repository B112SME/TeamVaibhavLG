package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BranchType {
	@Id
	private int id;
	private int branchTypeCode;
	private String branchType;
	private String Status;

}
