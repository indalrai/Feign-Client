package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name="STREET_NAME")
	private String  Street;
	@Column(name="CITY_NAME")
	private String city;
	@Column(name="STATE_NAME")
	private String state;
	@Column(name="PINCODE_NAME")
	private String pincode;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

}
