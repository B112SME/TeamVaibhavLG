package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDocuments {
	@Id
	private int udid;
	private byte [] aadharCard;
	private byte [] panCard;
	private byte [] photo;
	private byte[] signature;
	private byte[] thumb;

}
