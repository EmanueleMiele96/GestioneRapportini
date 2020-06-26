package it.gestrap.DAO;

import java.util.List;

import it.gestrap.entita.TipoCommesse;

public interface TipoCommesseDao {

	List<TipoCommesse> getAll();

	void save(TipoCommesse tipoCommesse);

	TipoCommesse get(int id);

	void delete(int id);

}
