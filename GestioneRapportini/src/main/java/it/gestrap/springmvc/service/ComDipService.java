package it.gestrap.springmvc.service;

import java.util.List;

import it.gestrap.entita.Comdip;

public interface ComDipService {

	
	public List<Comdip> getAll();

    public void save(Comdip cliente);

    public Comdip get(int id);

    public void delete(int id);
}
