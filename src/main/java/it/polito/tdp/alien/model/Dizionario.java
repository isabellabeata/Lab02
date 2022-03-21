package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;

public class Dizionario {
	private List<Parola> listaParoleAliene;


	public Dizionario() {
		super();
		this.listaParoleAliene=new LinkedList<Parola>();
	}


	public void add(Parola p) {
		this.listaParoleAliene.add(p);
		
	}
	public Parola trovaParole(String p) {
		for(Parola pi: this.listaParoleAliene) {
			if(pi.getAlieno().compareTo(p)==0)
				return pi;
		}
		return null;
	}
	public String traduzioni(String s){
		Parola p=this.trovaParole(s);
		return p.getTraduzioni().toString();
	}
	
	
}