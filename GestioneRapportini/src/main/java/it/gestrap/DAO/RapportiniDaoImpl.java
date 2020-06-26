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

import it.gestrap.entita.Rapportini;

@Repository
public class RapportiniDaoImpl implements RapportiniDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List < Rapportini > getAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb =  session.getCriteriaBuilder();
        CriteriaQuery < Rapportini > cq = cb.createQuery(Rapportini.class);
        Root < Rapportini > root = cq.from(Rapportini.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void save(Rapportini dipendente) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(dipendente);
    }

    @Override
    public Rapportini get(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Rapportini rapportino = currentSession.get(Rapportini.class, id);
        return rapportino;
    }
    
    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Rapportini rapportino = session.byId(Rapportini.class).load(id);
        session.delete(rapportino);
    }
}
