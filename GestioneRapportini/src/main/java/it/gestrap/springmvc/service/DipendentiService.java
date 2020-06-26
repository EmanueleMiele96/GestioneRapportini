package it.gestrap.springmvc.service;

import java.util.List;

import it.gestrap.entita.Dipendenti;


public interface DipendentiService {

	 public List<Dipendenti> getAll();

	    public void save(Dipendenti cliente);

	    public Dipendenti get(int id);

	    public void delete(int id);
}
