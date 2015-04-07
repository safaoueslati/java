package com.esprit.service;


import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.esprit.domain.ChiefRH;
import com.esprit.http.client.MyHTTPClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;


@Path("/myService")
@Stateless
public class MyService {
	
	@EJB
	ChiefRHService chiefRHService;
	
	@EJB
	MyHTTPClient httpClient;
	
	@GET
	@Path("/Chief")
	@Produces(MediaType.APPLICATION_JSON)
	public String GetChiefRH(){
		
		return httpClient.GET("http://recrut.azurewebsites.net/api/ChiefRH");
	
	}
	
	
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/addChief/")
	public String addBook(String chJson){
		
		Gson gson=new GsonBuilder()
		.serializeNulls()
		.registerTypeAdapter(ChiefRH.class,new JsonSerializer<ChiefRH>() {

			@Override
			public JsonElement serialize(ChiefRH src, Type typeOfSrc,
					JsonSerializationContext context) {
				
				JsonObject result=new JsonObject();
				
				result.addProperty("Id", "IS-"+src.getId_Chef());
				result.addProperty("Name", "<"+src.getName()+">");
				return result;
			}
		} )
		.create();
		
		ChiefRH chf=gson.fromJson(chJson, ChiefRH.class);
		
		System.out.println(gson.toJson(chf));
		
	chiefRHService.add(chf);
//		
		System.out.println(chiefRHService.getChiefs());
		
		
		//Map<String, Object> message=new HashMap<String, Object>();
		
		JsonObject message=new JsonObject();
		
		
		message.addProperty("LEVEL", "INFO");
		message.addProperty("CENTENT", "null");
		
		return gson.toJson(message);
	}

}
