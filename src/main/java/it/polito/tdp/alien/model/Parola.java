package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;

public class Parola {
	private String alieno;
	private List<String> traduzioni;
	
	public Parola(String alieno) {
		super();
		this.alieno = alieno;
		this.traduzioni = new LinkedList<String>();
	}
	public String getAlieno() {
		return alieno;
	}
	public void setAlieno(String alieno) {
		this.alieno = alieno;
	}
	public List<String> getTraduzioni() {
		return traduzioni;
	}
	public void setTraduzioni(List<String> traduzioni) {
		this.traduzioni= traduzioni;
	}
	public void setSignificato (String s) {
		this.traduzioni.add(s);
	}

	
	

}
