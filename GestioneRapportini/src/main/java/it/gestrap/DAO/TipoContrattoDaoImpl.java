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

import it.gestrap.entita.TipoContratto;

@Repository
public class TipoContrattoDaoImpl implements TipoContrattoDao{
	
	 @Autowired
	    private SessionFactory sessionFactory;

	    @Override
	    public List < TipoContratto > getAll() {
	        Session session = sessionFactory.getCurrentSession();
	        CriteriaBuilder cb =  session.getCriteriaBuilder();
	        CriteriaQuery < TipoContratto > cq = cb.createQuery(TipoContratto.class);
	        Root < TipoContratto > root = cq.from(TipoContratto.class);
	        cq.select(root);
	        Query query = session.createQuery(cq);
	        return query.getResultList();
	    }

	    @Override
	    public void save(TipoContratto tipoContratto) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        currentSession.saveOrUpdate(tipoContratto);
	    }

	    @Override
	    public TipoContratto get(int id) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        TipoContratto tipoContratto = currentSession.get(TipoContratto.class, id);
	        return tipoContratto;
	    }
	    
	    @Override
	    public void delete(int id) {
	        Session session = sessionFactory.getCurrentSession();
	        TipoContratto tipoContratto = session.byId(TipoContratto.class).load(id);
	        session.delete(tipoContratto);
	    }
}
