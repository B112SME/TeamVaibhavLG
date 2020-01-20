package com.crts.app.sme.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String fullName;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Address> userLaddress;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Address> userPaddress;
	private long userMobno;
	private long userAmobno;
	private String userEmail;
	private String userGender;
	private String userName;
	private String passWord;
	@OneToOne(cascade=CascadeType.ALL)
	private Role userRole;
	@OneToOne(cascade=CascadeType.ALL)
	private Branch userBranch;
	private String userDob;
	private String userDoj;
	private int userStatusCode;
	@OneToOne
	private UserDocuments userdocument;

}
