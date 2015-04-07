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

@Path("/InterviewService")
@Stateless
public class InterviewService {
	@EJB
	MyHTTPClient httpClient;
	
	@GET
	@Path("/Interview")
	@Produces(MediaType.APPLICATION_JSON)
	public String GetInterview(){
		
		return httpClient.GET("http://recrut.azurewebsites.net/api/Interview");
	
	}
	
	
	@POST
	@Path("/CreateInterview")
	@Consumes(MediaType.APPLICATION_JSON)
	public void CreateJobOffer(String InterviewJson){
		System.out.println(InterviewJson);
		System.out.println("************************************");
		httpClient.POST("http://recrut.azurewebsites.net/api/Interview",InterviewJson);
	}
	
	@DELETE
	@Path("/{Id_Int}")
	public String supprimer(@PathParam("Id_Int") String a){
		
		return httpClient.DELETE("http://recrut.azurewebsites.net/api/Interview/"+a);
	}
}

