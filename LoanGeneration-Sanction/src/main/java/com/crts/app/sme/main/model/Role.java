package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	private int roleId;
	private String roleName;
	private int roleStatusCode;

}
