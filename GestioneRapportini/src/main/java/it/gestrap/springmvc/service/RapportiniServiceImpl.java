package it.gestrap.springmvc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import it.gestrap.DAO.RapportiniDao;
import it.gestrap.entita.Rapportini;

public class RapportiniServiceImpl implements RapportiniService {

	@Autowired
	private RapportiniDao rapportiniDAO;

	@Override
	@Transactional
	public  List<Rapportini> getAll() {
		return rapportiniDAO.getAll();
	}

	@Override
	@Transactional
	public void save(Rapportini theCustomer) {
		rapportiniDAO.save(theCustomer);
	}

	@Override
	@Transactional
	public Rapportini get(int theId) {
		return rapportiniDAO.get(theId);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		rapportiniDAO.delete(theId);
	}
}