package com.esprit.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
	public Integer IdEmp;
	public String Login;
	public String Password;
	public String Name;
	public String LastName;
	public String Mail;
	public String Role;
	public Integer CurrPoint;
	
	@JsonProperty("IdEmp")
	public Integer getIdEmp() {
		return IdEmp;
	}
	@JsonProperty("Login")
	public String getLogin() {
		return Login;
	}
	@JsonProperty("Name")
	public String getName() {
		return Name;
	}
	@JsonProperty("LastName")
	public String getLastName() {
		return LastName;
	}
	@JsonProperty("IdEmp")
	public String getMail() {
		return Mail;
	}
	@JsonProperty("Password")
	public String getPassword() {
		return Password;
	}
	@JsonProperty("Role")
	public String getRole() {
		return Role;
	}
	@JsonProperty("CurrPoint")
	public Integer getCurrPoint() {
		return CurrPoint;
	}
	public void setCurrPoint(Integer currPoint) {
		CurrPoint = currPoint;
	}
	public void setIdEmp(Integer idEmp) {
		IdEmp = idEmp;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public void setRole(String role) {
		Role = role;
	}

}
