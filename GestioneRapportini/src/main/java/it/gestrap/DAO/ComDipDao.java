package it.gestrap.DAO;

import java.util.List;

import it.gestrap.entita.Comdip;

public interface ComDipDao {

	List<Comdip> getAll();

	void save(Comdip cliente);

	Comdip get(int id);

	void delete(int id);

}
