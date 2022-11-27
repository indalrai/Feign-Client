package com.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
	
	private int userId;
	//ex:-combination of object +Id act as a primary key;
//	@EmbeddedId
//	private LoginName userId1;
	
	private String userName;
	@Embedded
	@AttributeOverrides ({
	@AttributeOverride (name="Street",column=@Column(name="HOME_STREET_NAME")),
	@AttributeOverride (name="city",column=@Column(name="HOME_CITY_NAME")),
	@AttributeOverride (name="state",column=@Column(name="HOME_STATE_NAME")),
	@AttributeOverride (name="pincode",column=@Column(name="HOME_PINCODE_NAME"))})
	private Address address;
	@Embedded
	private Address officeAddress;

	public String getUserName() {
		return userName;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

}
