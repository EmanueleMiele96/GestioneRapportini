package it.gestrap.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import it.gestrap.DAO.DipendentiDao;
import it.gestrap.DAO.TipoCommesseDao;
import it.gestrap.entita.Dipendenti;
import it.gestrap.entita.TipoCommesse;

public class TipoCommesseServiceImpl implements TipoCommesseService {


	@Autowired
	private TipoCommesseDao tipoCommesseDao;

	@Override
	@Transactional
	public  List<TipoCommesse> getAll() {
		return tipoCommesseDao.getAll();
	}

	@Override
	@Transactional
	public void save(TipoCommesse theCustomer) {
		tipoCommesseDao.save(theCustomer);
	}

	@Override
	@Transactional
	public TipoCommesse get(int theId) {
		return tipoCommesseDao.get(theId);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		tipoCommesseDao.delete(theId);
	}
}