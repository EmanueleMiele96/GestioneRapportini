package it.gestrap.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import it.gestrap.DAO.CommesseDao;
import it.gestrap.entita.Commesse;

public class CommesseServiceImpl implements CommesseService {

	
	@Autowired
	private CommesseDao commesseDao;

	@Override
	@Transactional
	public  List<Commesse> getAll() {
		return commesseDao.getAll();
	}

	@Override
	@Transactional
	public void save(Commesse theCustomer) {
		commesseDao.save(theCustomer);
	}

	@Override
	@Transactional
	public Commesse get(int theId) {
		return commesseDao.get(theId);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		commesseDao.delete(theId);
	}
}