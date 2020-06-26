package it.gestrap.DAO;

import java.util.List;

import it.gestrap.entita.Commesse;

public interface CommesseDao {

	List<Commesse> getAll();

	void save(Commesse cliente);

	Commesse get(int id);

	void delete(int id);

}
