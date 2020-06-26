package it.gestrap.DAO;

import java.util.List;

import it.gestrap.entita.TipoContratto;

public interface TipoContrattoDao {

	List<TipoContratto> getAll();

	void save(TipoContratto tipoContratto);

	TipoContratto get(int id);

	void delete(int id);

}
