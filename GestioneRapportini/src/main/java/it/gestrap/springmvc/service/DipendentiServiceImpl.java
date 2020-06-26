package it.gestrap.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import it.gestrap.DAO.DipendentiDao;
import it.gestrap.entita.Dipendenti;

public class DipendentiServiceImpl implements DipendentiService {

	@Autowired
	private DipendentiDao dipendentiDAO;

	@Override
	@Transactional
	public  List<Dipendenti> getAll() {
		return dipendentiDAO.getAll();
	}

	@Override
	@Transactional
	public void save(Dipendenti theCustomer) {
		dipendentiDAO.save(theCustomer);
	}

	@Override
	@Transactional
	public Dipendenti get(int theId) {
		return dipendentiDAO.get(theId);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		dipendentiDAO.delete(theId);
	}
}