package com.signup.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Status")
@SequenceGenerator(name = "statusidseq", initialValue=1, allocationSize=4)
public class Status {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="statusidseq")
	private int statusId;
	
	private String description;
	private LocalDate validFrom;
	private LocalDate validTo;
	private int subcriptionId;
	private int isActive;
	private LocalDate modifiedOn;
	private String modifiedBy;
	private String remarks;
	
	
	
	
	public int getStatusId() {
		return statusId;
	}
	public void setId(int statusId) {
		this.statusId = statusId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}
	public LocalDate getValidTo() {
		return validTo;
	}
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}
	public int getSubcriptionId() {
		return subcriptionId;
	}
	public void setSubcriptionId(int subcriptionId) {
		this.subcriptionId = subcriptionId;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	@Override
	public String toString() {
		return "Status [id=" + statusId + ", description=" + description + ", validFrom=" + validFrom + ", validTo=" + validTo
				+ ", subcriptionId=" + subcriptionId + ", isActive=" + isActive + ", modifiedOn=" + modifiedOn
				+ ", modifiedBy=" + modifiedBy + ", remarks=" + remarks + "]";
	}
	
	
	
	

}
