package it.gestrap.springmvc.service;

import java.util.List;

import it.gestrap.entita.Commesse;

public interface CommesseService {

	public List<Commesse> getAll();

    public void save(Commesse cliente);

    public Commesse get(int id);

    public void delete(int id);
}
