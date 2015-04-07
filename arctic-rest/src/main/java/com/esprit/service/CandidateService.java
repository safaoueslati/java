package com.esprit.service;



import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.esprit.http.client.MyHTTPClient;

@Path("/CandidateService")
@Stateless
public class CandidateService {
	@EJB
	MyHTTPClient httpClient;
	
	@GET
	@Path("/Candidate")
	@Produces(MediaType.APPLICATION_JSON)
	public String GetCandidate(){
		
		return httpClient.GET("http://recrut.azurewebsites.net/api/Candidate");
	
	}
	
	
	@POST
	@Path("/CreateCandidate")
	@Consumes(MediaType.APPLICATION_JSON)
	public void CreateCandidate(String CandidateJson){
		System.out.println(CandidateJson);
		System.out.println("************************************");
		httpClient.POST("http://recrut.azurewebsites.net/api/Candidate",CandidateJson);
	}
	
	@DELETE
	@Path("/{IdCand}")
	public String supprimer(@PathParam("IdCand") String a){
		
		return httpClient.DELETE("http://recrut.azurewebsites.net/api/Candidate/"+a);
	}
	
	
}


