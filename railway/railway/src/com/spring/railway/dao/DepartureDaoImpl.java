package com.spring.railway.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.railway.model.Diparture;
import com.spring.railway.model.Trains;
import com.spring.railway.model.Users;
@Repository
public class DepartureDaoImpl implements DepartureDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public void addDiparture(Diparture diparture) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(diparture);
	}

	@Override
	@Transactional
	public List<Diparture> getDiparture() {
			Session currentSession = sessionFactory.getCurrentSession();
		//	Query<Staff> createQuery = (Query<Staff>) currentSession.createQuery("from staff");
			List<Diparture> dipartureList = currentSession.createQuery("from diparture").list();
			return dipartureList;
	}

	@Override
	@Transactional
	public List<Diparture> getDiparture(String station) {
		Session currentSession = sessionFactory.getCurrentSession();
		//	Query<Staff> createQuery = (Query<Staff>) currentSession.createQuery("from staff");
		Query<Diparture> createQuery = currentSession.createQuery("from diparture where fromStation like :fromStation");
		createQuery.setParameter("fromStation", station);
		List<Diparture> dipartureList = createQuery.getResultList();
			return dipartureList;
	}
}
