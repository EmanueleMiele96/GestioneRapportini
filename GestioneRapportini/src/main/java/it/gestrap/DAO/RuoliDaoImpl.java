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

import it.gestrap.entita.Ruoli;

@Repository
public class RuoliDaoImpl implements RuoliDao{
	
	 @Autowired
	    private SessionFactory sessionFactory;

	    @Override
	    public List < Ruoli > getAll() {
	        Session session = sessionFactory.getCurrentSession();
	        CriteriaBuilder cb =  session.getCriteriaBuilder();
	        CriteriaQuery < Ruoli > cq = cb.createQuery(Ruoli.class);
	        Root < Ruoli > root = cq.from(Ruoli.class);
	        cq.select(root);
	        Query query = session.createQuery(cq);
	        return query.getResultList();
	    }

	    @Override
	    public void save(Ruoli dipendente) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        currentSession.saveOrUpdate(dipendente);
	    }

	    @Override
	    public Ruoli get(int id) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Ruoli ruolo = currentSession.get(Ruoli.class, id);
	        return ruolo;
	    }
	    
	    @Override
	    public void delete(int id) {
	        Session session = sessionFactory.getCurrentSession();
	        Ruoli ruolo = session.byId(Ruoli.class).load(id);
	        session.delete(ruolo);
	    }
}
