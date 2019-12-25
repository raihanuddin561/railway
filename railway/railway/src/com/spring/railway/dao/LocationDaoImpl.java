package com.spring.railway.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.railway.model.Location;


@Repository
public class LocationDaoImpl implements LocationDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public List<Location> getLocation() {
		Session currentSession = sessionFactory.getCurrentSession();
		//	Query<Staff> createQuery = (Query<Staff>) currentSession.createQuery("from staff");
			List<Location> locationList = currentSession.createQuery("from location").list();
			return locationList;
	}




	@Override
	@Transactional
	public void addLocation(Location location) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(location);
	}

}
