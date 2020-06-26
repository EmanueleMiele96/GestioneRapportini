package it.gestrap.springmvc.service;

import java.util.List;

import it.gestrap.entita.TipoContratto;

public interface TipoContrattoService {

	 public List<TipoContratto> getAll();

	    public void save(TipoContratto cliente);

	    public TipoContratto get(int id);

	    public void delete(int id);
	
}
