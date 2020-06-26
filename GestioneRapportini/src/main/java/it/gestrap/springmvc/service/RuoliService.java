package it.gestrap.springmvc.service;

import java.util.List;

import it.gestrap.entita.Ruoli;

public interface RuoliService {
	
	public List<Ruoli> getAll();

    public void save(Ruoli cliente);

    public Ruoli get(int id);

    public void delete(int id);

}
