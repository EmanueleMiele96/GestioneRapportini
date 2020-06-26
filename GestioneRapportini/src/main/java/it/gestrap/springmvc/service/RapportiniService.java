package it.gestrap.springmvc.service;

import java.util.List;

import it.gestrap.entita.Rapportini;

public interface RapportiniService {
	
	 public List<Rapportini> getAll();

	    public void save(Rapportini cliente);

	    public Rapportini get(int id);

	    public void delete(int id);

}
