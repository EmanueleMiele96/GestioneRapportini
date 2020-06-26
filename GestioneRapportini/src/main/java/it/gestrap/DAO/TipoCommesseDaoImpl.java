package it.gestrap.DAO;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import it.gestrap.entita.TipoCommesse;

public class TipoCommesseDaoImpl implements TipoCommesseDao{

	
	 @Autowired
	    private SessionFactory sessionFactory;

	    @Override
	    public List < TipoCommesse > getAll() {
	        Session session = sessionFactory.getCurrentSession();
	        CriteriaBuilder cb =  session.getCriteriaBuilder();
	        CriteriaQuery < TipoCommesse > cq = cb.createQuery(TipoCommesse.class);
	        Root < TipoCommesse > root = cq.from(TipoCommesse.class);
	        cq.select(root);
	        Query query = session.createQuery(cq);
	        return query.getResultList();
	    }

	    @Override
	    public void save(TipoCommesse tipoCommesse) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        currentSession.saveOrUpdate(tipoCommesse);
	    }

	    @Override
	    public TipoCommesse get(int id) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        TipoCommesse tipoCommesse = currentSession.get(TipoCommesse.class, id);
	        return tipoCommesse;
	    }
	    
	    @Override
	    public void delete(int id) {
	        Session session = sessionFactory.getCurrentSession();
	        TipoCommesse tipoCommesse = session.byId(TipoCommesse.class).load(id);
	        session.delete(tipoCommesse);
	    }
}
