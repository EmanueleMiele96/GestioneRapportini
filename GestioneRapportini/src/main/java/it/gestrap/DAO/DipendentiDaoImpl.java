package it.gestrap.DAO;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.gestrap.entita.Dipendenti;

@Repository
public class DipendentiDaoImpl implements DipendentiDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List < Dipendenti > getAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb =  session.getCriteriaBuilder();
        CriteriaQuery < Dipendenti > cq = cb.createQuery(Dipendenti.class);
        Root < Dipendenti > root = cq.from(Dipendenti.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void save(Dipendenti dipendente) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(dipendente);
    }

    @Override
    public Dipendenti get(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Dipendenti dipendente = currentSession.get(Dipendenti.class, id);
        return dipendente;
    }
    
    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Dipendenti dipendente = session.byId(Dipendenti.class).load(id);
        session.delete(dipendente);
    }
    
	
}
