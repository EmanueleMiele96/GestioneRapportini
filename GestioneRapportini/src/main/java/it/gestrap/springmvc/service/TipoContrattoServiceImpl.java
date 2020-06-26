package it.gestrap.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import it.gestrap.DAO.TipoContrattoDao;
import it.gestrap.entita.TipoContratto;

public class TipoContrattoServiceImpl implements TipoContrattoService {

	
	@Autowired
	private TipoContrattoDao tipoDiContrattoDao;

	@Override
	@Transactional
	public  List<TipoContratto> getAll() {
		return tipoDiContrattoDao.getAll();
	}

	@Override
	@Transactional
	public void save(TipoContratto theCustomer) {
		tipoDiContrattoDao.save(theCustomer);
	}

	@Override
	@Transactional
	public TipoContratto get(int theId) {
		return tipoDiContrattoDao.get(theId);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		tipoDiContrattoDao.delete(theId);
	}
}