package it.gestrap.DAO;

import java.util.List;

import it.gestrap.entita.Rapportini;

public interface RapportiniDao {

	List<Rapportini> getAll();

	void save(Rapportini cliente);

	Rapportini get(int id);

	void delete(int id);

}
