package com.signup.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PersonalInfo")
@SequenceGenerator(name = "personalidseq", initialValue=10, allocationSize=4)
public class PersonalInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="personalidseq")
	private int personalId;
	
	private String userId;
	private String mobileNo;
	private String email;
	
	@JoinColumn(name = "addressId")
	@NotNull
	@OneToOne(cascade = CascadeType.MERGE)
	private Address addressId;
	
	private int isActive;
	private String image;
	private String remarks;
	
	
	
	/*Getters and Setters*/
	
	public int getPersonalId() {
		return personalId;
	}
	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Address getAddressId() {
		return addressId;
	}
	public void setAddressId(Address addressId) {
		this.addressId = addressId;
	}
	
	@Override
	public String toString() {
		return "PersonalInfo [personalId=" + personalId + ", userId=" + userId + ", mobileNo=" + mobileNo + ", email="
				+ email + ", addressId=" + addressId + ", isActive=" + isActive + ", image=" + image + ", remarks="
				+ remarks + "]";
	}
	
	
}
