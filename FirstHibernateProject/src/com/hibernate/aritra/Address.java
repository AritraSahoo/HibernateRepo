package com.hibernate.aritra;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String flatName;
	private String City;
	private int pinNo;
	public String getFlatName() {
		return flatName;
	}
	public void setFlatName(String flatName) {
		this.flatName = flatName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	

}
