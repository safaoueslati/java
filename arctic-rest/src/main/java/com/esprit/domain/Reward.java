package com.esprit.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Reward {

	public Integer Id_rew;
	public String NameReward;
	public Integer TopPoints;
	public String Description;
	public List<Employee> employees;
	
	@JsonProperty("Description")
	public String getDescription() {
		return Description;
	}
	@JsonProperty("Id_rew")
	public Integer getId_rew() {
		return Id_rew;
	}
	@JsonProperty("NameReward")
	public String getNameReward() {
		return NameReward;
	}
	public Integer getTopPoints() {
		return TopPoints;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
	public void setId_rew(Integer id_rew) {
		Id_rew = id_rew;
	}
	public void setNameReward(String nameReward) {
		NameReward = nameReward;
	}
	public void setTopPoints(Integer topPoints) {
		TopPoints = topPoints;
	}
	@JsonProperty("Employee")
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
