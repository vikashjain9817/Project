package com.signup.beans;

import java.time.LocalDate;

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
@Table(name = "signup")
@SequenceGenerator(name = "orgidseq", initialValue=100, allocationSize=5)
public class Oragnization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="orgidseq")
	private int id;
	
	private String userId;
	private String pass;
	private String type;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "statusId")
	@NotNull
	private Status status;
	
	private String paymentType;
	private LocalDate createdOn;
	private String createdBy;
	private LocalDate modifiedOn;
	private String modifiedBy;
	private int isActive;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personalId")
	@NotNull
	private PersonalInfo personalDetailId;
	private String remarks;
	
	
	
	/* Getters and Setters*/

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public LocalDate getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDate getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(LocalDate modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public PersonalInfo getPersonalDetailId() {
		return personalDetailId;
	}
	public void setPersonalDetailId(PersonalInfo personalDetailId) {
		this.personalDetailId = personalDetailId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Oragnization [id=" + id + ", userId=" + userId + ", pass=" + pass + ", type=" + type + ", status="
				+ status + ", paymentType=" + paymentType + ", createdOn=" + createdOn + ", createdBy=" + createdBy
				+ ", modifiedOn=" + modifiedOn + ", modifiedBy=" + modifiedBy + ", isActive=" + isActive
				+ ", personalDetailId=" + personalDetailId + ", remarks=" + remarks + "]";
	}
	
	
	
	

}
