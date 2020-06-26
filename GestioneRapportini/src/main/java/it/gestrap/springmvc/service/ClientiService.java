package it.gestrap.springmvc.service;

import java.util.List;

import it.gestrap.entita.Clienti;

public interface ClientiService {

    public List<Clienti> getAll();

    public void save(Clienti cliente);

    public Clienti get(int id);

    public void delete(int id);
}