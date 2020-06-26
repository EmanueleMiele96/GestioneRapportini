package it.gestrap.DAO;

import java.util.List;

import it.gestrap.entita.Ruoli;

public interface RuoliDao {

	List<Ruoli> getAll();

	void save(Ruoli cliente);

	Ruoli get(int id);

	void delete(int id);

}
