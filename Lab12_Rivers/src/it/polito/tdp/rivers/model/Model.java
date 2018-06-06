package it.polito.tdp.rivers.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.rivers.db.RiversDAO;

public class Model {
	
	private List <River> fiumi;
	private RiversDAO rdao; 
	
	public Model() {
		this.rdao = new RiversDAO(); 
		this.fiumi =  new ArrayList<>(rdao.getAllRivers()); 
	}

	public List<River> getFiumi() {
		return fiumi;
	}

	public String getFirstDate(River fiume) {
		return rdao.getFirstDate(fiume);
	}
	
	public String getEndDate(River fiume) {
		return rdao.getEndDate(fiume);
	}

	public String getNumberOfMeasurements(River fiume) {
		return rdao.getNumberOfMeasurements(fiume); 	
	}


	public String getMidFlow(River fiume) {
		return rdao.getMidFlow(fiume);
	}

	
}
