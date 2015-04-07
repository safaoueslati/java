package com.esprit.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JobOffer {

	public Integer IdJob ;
    public String NameJob ;
    public String DescriptionJob ;
    public Date SharingDate;
    public String IsActive ;
    public List<Employee> Employees ;
    @JsonProperty("IdJob")
	public Integer getIdJob() {
		return IdJob;
	}
	public void setIdJob(Integer idJob) {
		IdJob = idJob;
	}
	@JsonProperty("NameJob")
	public String getNameJob() {
		return NameJob;
	}
	public void setNameJob(String nameJob) {
		NameJob = nameJob;
	}
	@JsonProperty("DescriptionJob")
	public String getDescriptionJob() {
		return DescriptionJob;
	}
	public void setDescriptionJob(String descriptionJob) {
		DescriptionJob = descriptionJob;
	}
	@JsonProperty("SharingDate")
	public Date getSharingDate() {
		return SharingDate;
	}
	public void setSharingDate(Date sharingDate) {
		SharingDate = sharingDate;
	}
	@JsonProperty("IsActive")
	public String getIsActive() {
		return IsActive;
	}
	public void setIsActive(String isActive) {
		IsActive = isActive;
	}
	@JsonProperty("Employee")
	public List<Employee> getEmployees() {
		return Employees;
	}
	public void setEmployees(List<Employee> employees) {
		Employees = employees;
	}
    
    
}
