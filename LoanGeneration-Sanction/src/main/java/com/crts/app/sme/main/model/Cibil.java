package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cibil {
	
	@Id
	private int cibilId;
	private int leadId;
	private double cibilScore;
	private String cibilScoreDateTime;
	private int status;
	private String remark;

}
