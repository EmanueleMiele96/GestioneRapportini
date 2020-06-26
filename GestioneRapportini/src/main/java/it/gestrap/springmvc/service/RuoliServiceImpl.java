package it.gestrap.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import it.gestrap.DAO.RuoliDao;
import it.gestrap.entita.Ruoli;

public class RuoliServiceImpl implements RuoliService {

	@Autowired
	private RuoliDao ruoliDao;

	@Override
	@Transactional
	public  List<Ruoli> getAll() {
		return ruoliDao.getAll();
	}

	@Override
	@Transactional
	public void save(Ruoli theCustomer) {
		ruoliDao.save(theCustomer);
	}

	@Override
	@Transactional
	public Ruoli get(int theId) {
		return ruoliDao.get(theId);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		ruoliDao.delete(theId);
	}
}