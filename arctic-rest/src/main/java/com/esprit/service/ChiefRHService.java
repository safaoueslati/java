package com.esprit.service;

import java.util.HashSet;
import java.util.Set;

import javax.ejb.Singleton;
import javax.ws.rs.Path;

import com.esprit.domain.ChiefRH;



@Singleton
public class ChiefRHService {

	private Set<ChiefRH> chiefs=new HashSet<ChiefRH>();
	
	
	public void add(ChiefRH chief){
		chiefs.add(chief);
	}
	
	public Set<ChiefRH> getChiefs() {
		return chiefs;
	}
	
	
}
