package it.gestrap.springmvc.service;

import java.util.List;

import it.gestrap.entita.TipoCommesse;

public interface TipoCommesseService {

	public List<TipoCommesse> getAll();

    public void save(TipoCommesse cliente);

    public TipoCommesse get(int id);

    public void delete(int id);
}
