package com.esprit.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Candidate {
	public Integer IdCand;
    public String NameCand ;
    public String LastNameCand;
    public String LoginCand ;
    public String PasswordCand;
    public Date DateBirth;
    public String MailCand;
    public Integer PhoneNumber;
    public String AdressCand;
    public String ExperCand;
    public List<Employee> Employees ;
    public List<Notification> Notifications;
    @JsonProperty("IdCand")
	public Integer getIdCand() {
		return IdCand;
	}
	public void setIdCand(Integer idCand) {
		IdCand = idCand;
	}
	@JsonProperty("NameCand")
	public String getNameCand() {
		return NameCand;
	}
	public void setNameCand(String nameCand) {
		NameCand = nameCand;
	}
	@JsonProperty("LastNameCand")
	public String getLastNameCand() {
		return LastNameCand;
	}
	public void setLastNameCand(String lastNameCand) {
		LastNameCand = lastNameCand;
	}
	@JsonProperty("LoginCand")
	public String getLoginCand() {
		return LoginCand;
	}
	public void setLoginCand(String loginCand) {
		LoginCand = loginCand;
	}
	@JsonProperty("PasswordCand")
	public String getPasswordCand() {
		return PasswordCand;
	}
	public void setPasswordCand(String passwordCand) {
		PasswordCand = passwordCand;
	}
	@JsonProperty("IdCand")
	public Date getDateBirth() {
		return DateBirth;
	}
	public void setDateBirth(Date dateBirth) {
		DateBirth = dateBirth;
	}
	@JsonProperty("MailCand")
	public String getMailCand() {
		return MailCand;
	}
	public void setMailCand(String mailCand) {
		MailCand = mailCand;
	}
	@JsonProperty("PhoneNumber")
	public Integer getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	@JsonProperty("AdressCand")
	public String getAdressCand() {
		return AdressCand;
	}
	public void setAdressCand(String adressCand) {
		AdressCand = adressCand;
	}
	@JsonProperty("ExperCand")
	public String getExperCand() {
		return ExperCand;
	}
	public void setExperCand(String experCand) {
		ExperCand = experCand;
	}
	@JsonProperty("Employee")
	public List<Employee> getEmployees() {
		return Employees;
	}
	public void setEmployees(List<Employee> employees) {
		Employees = employees;
	}
	@JsonProperty("Notification")
	public List<Notification> getNotifications() {
		return Notifications;
	}
	public void setNotifications(List<Notification> notifications) {
		Notifications = notifications;
	}
    

}
