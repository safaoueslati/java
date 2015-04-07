package com.esprit.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ChiefRH {

	private Integer id_Chef  ;
	private String login ;
	private String password;
	private String name;
	private String lastName;
	private String mail;
	
	public List<Employee> employees;
	
   @JsonProperty("id_Chef")
	public Integer getId_Chef() {
		return id_Chef;
	}
	public void setId_Chef(Integer id_Chef) {
		this.id_Chef = id_Chef;
	}
	@JsonProperty("login")
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	@JsonProperty("password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@JsonProperty("mail")
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Chief [Name= " + name + ", Last Name=" + lastName + "]";
	}
	@JsonProperty("Employee")
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}
