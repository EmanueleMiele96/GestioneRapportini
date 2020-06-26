package it.gestrap.DAO;

import java.util.List;

import org.hibernate.Session;

import it.gestrap.entita.Clienti;

public interface ClientiDao {

    public List < Clienti > getAll();

    public void save(Object object);

    public Clienti get(int theId);

    public void delete(int theId);
    
}