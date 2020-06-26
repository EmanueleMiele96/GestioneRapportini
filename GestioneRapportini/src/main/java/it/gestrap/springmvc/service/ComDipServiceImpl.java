package it.gestrap.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import it.gestrap.DAO.ComDipDao;
import it.gestrap.entita.Comdip;

public class ComDipServiceImpl implements ComDipService {

	
	@Autowired
	private ComDipDao compDipDao;

	@Override
	@Transactional
	public  List<Comdip> getAll() {
		return compDipDao.getAll();
	}

	@Override
	@Transactional
	public void save(Comdip theCustomer) {
		compDipDao.save(theCustomer);
	}

	@Override
	@Transactional
	public Comdip get(int theId) {
		return compDipDao.get(theId);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		compDipDao.delete(theId);
	}
}
