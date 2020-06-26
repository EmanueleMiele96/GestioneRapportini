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

import it.gestrap.entita.Comdip;

@Repository
public class ComDipDaoImpl implements ComDipDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List < Comdip > getAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb =  session.getCriteriaBuilder();
        CriteriaQuery < Comdip > cq = cb.createQuery(Comdip.class);
        Root < Comdip > root = cq.from(Comdip.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void save(Comdip comdip) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(comdip);
    }

    @Override
    public Comdip get(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Comdip comdip = currentSession.get(Comdip.class, id);
        return comdip;
    }
    
    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Comdip comdip = session.byId(Comdip.class).load(id);
        session.delete(comdip);
    }
    
}
