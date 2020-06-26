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

import it.gestrap.entita.Commesse;

@Repository
public class CommesseDaoImpl implements CommesseDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List < Commesse > getAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb =  session.getCriteriaBuilder();
        CriteriaQuery < Commesse > cq = cb.createQuery(Commesse.class);
        Root < Commesse > root = cq.from(Commesse.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void save(Commesse cliente) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(cliente);
    }

    @Override
    public Commesse get(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Commesse commessa = currentSession.get(Commesse.class, id);
        return commessa;
    }
    
    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Commesse commessa = session.byId(Commesse.class).load(id);
        session.delete(commessa);
    }
    
	
	
}
