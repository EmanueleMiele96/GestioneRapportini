package it.gestrap.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import it.gestrap.DAO.ClientiDao;
import it.gestrap.DAO.ClientiDaoImpl;
import it.gestrap.entita.Clienti;

@Service
public class ClientiServiceImpl implements ClientiService {

    @Autowired
    private ClientiDao clientiDAO;

    @Override
    @Transactional
    public  List<Clienti> getAll() {
        return clientiDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Clienti theCustomer) {
        clientiDAO.save(theCustomer);
    }

    @Override
    @Transactional
    public Clienti get(int theId) {
        return clientiDAO.get(theId);
    }

    @Override
    @Transactional
    public void delete(int theId) {
        clientiDAO.delete(theId);
    }
    
}
