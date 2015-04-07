package com.esprit.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Interview {

	public Integer Id_Int;
    public Date DateInter;
    public String Duration;
    public String Other;
    public List<Candidate> Candidates ;
    @JsonProperty("Id_Int")
	public Integer getId_Int() {
		return Id_Int;
	}
	public void setId_Int(Integer id_Int) {
		Id_Int = id_Int;
	}
	@JsonProperty("DateInter")
	public Date getDateInter() {
		return DateInter;
	}
	public void setDateInter(Date dateInter) {
		DateInter = dateInter;
	}
	@JsonProperty("Duration")
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	@JsonProperty("Other")
	public String getOther() {
		return Other;
	}
	public void setOther(String other) {
		Other = other;
	}
	@JsonProperty("Candidate")
	public List<Candidate> getCandidates() {
		return Candidates;
	}
	public void setCandidates(List<Candidate> candidates) {
		Candidates = candidates;
	}
    
}
