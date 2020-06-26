package it.gestrap.DAO;

import java.util.List;

import it.gestrap.entita.Commesse;
import it.gestrap.entita.Dipendenti;

public interface DipendentiDao {
	
	List<Dipendenti> getAll();

	void save(Dipendenti cliente);

	Dipendenti get(int id);

	void delete(int id);
}
