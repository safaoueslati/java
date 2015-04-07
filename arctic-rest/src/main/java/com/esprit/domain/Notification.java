package com.esprit.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Notification {
	public Integer IdNot;
    public String DescriptionNot;
    public Date DateNot;
    public List<Candidate> Candidates;
    public List<Employee> Employees;
    @JsonProperty("IdNot")
	public Integer getIdNot() {
		return IdNot;
	}
	public void setIdNot(Integer idNot) {
		IdNot = idNot;
	}
	@JsonProperty("DescriptionNot")
	public String getDescriptionNot() {
		return DescriptionNot;
	}
	public void setDescriptionNot(String descriptionNot) {
		DescriptionNot = descriptionNot;
	}
	@JsonProperty("DateNot")
	public Date getDateNot() {
		return DateNot;
	}
	public void setDateNot(Date dateNot) {
		DateNot = dateNot;
	}
	@JsonProperty("Candidate")
	public List<Candidate> getCandidates() {
		return Candidates;
	}
	public void setCandidates(List<Candidate> candidates) {
		Candidates = candidates;
	}
	@JsonProperty("Employee")
	public List<Employee> getEmployees() {
		return Employees;
	}
	public void setEmployees(List<Employee> employees) {
		Employees = employees;
	}

}
