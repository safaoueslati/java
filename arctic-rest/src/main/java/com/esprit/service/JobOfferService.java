package com.esprit.service;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

import com.esprit.http.client.MyHTTPClient;

@Path("/JobOfferService")
@Stateless
public class JobOfferService {
	@EJB
	MyHTTPClient httpClient;
	
	@GET
	@Path("/JobOffer")
	@Produces(MediaType.APPLICATION_JSON)
	public String GetJobOffer(){
		
		return httpClient.GET("http://recrut.azurewebsites.net/api/JobOffer");
	
	}
	
	
	@POST
	@Path("/CreateJobOffer")
	@Consumes(MediaType.APPLICATION_JSON)
	public void CreateJobOffer(String JobOfferJson){
		System.out.println(JobOfferJson);
		System.out.println("************************************");
		httpClient.POST("http://recrut.azurewebsites.net/api/JobOffer",JobOfferJson);
	}
	
	@DELETE
	@Path("/{IdJob}")
	public String suppJobOffer(@PathParam("IdJob") String a){
		
		return httpClient.DELETE("http://recrut.azurewebsites.net/api/JobOffer/"+a);
	}
}

