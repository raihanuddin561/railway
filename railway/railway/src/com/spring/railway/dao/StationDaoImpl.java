package com.spring.railway.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.railway.model.Stations;
import com.spring.railway.model.Trains;
@Repository
public class StationDaoImpl implements StationDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public void addStation(Stations station) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(station);
	}

	@Override
	@Transactional
	public List<Stations> getStation() {
			Session currentSession = sessionFactory.getCurrentSession();
		//	Query<Staff> createQuery = (Query<Staff>) currentSession.createQuery("from staff");
			List<Stations> stationList = currentSession.createQuery("from stations").list();
			return stationList;
	}
}
