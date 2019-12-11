package com.signup.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
@SequenceGenerator(name = "addressidseq", initialValue=100, allocationSize=4)
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="addressidseq")
	private int addressId;
	
	private String country;
	private String state;
	private String city;
	private String locality;
	private String pinCode;
	
	private int isActive;
	
	private String remarks;
	
	
	/*Getters and setters*/

	public int getId() {
		return addressId;
	}

	public void setId(int addressId) {
		this.addressId = addressId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Address [id=" + addressId + ", country=" + country + ", state=" + state + ", city=" + city + ", locality="
				+ locality + ", pinCode=" + pinCode + ", isActive=" + isActive + ", remarks=" + remarks + "]";
	}
	
	
	
	
	
	
	
	
	
}
