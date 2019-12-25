package com.spring.railway.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.railway.model.Trains;
@Repository
public class TrainDaoImpl implements TrainDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public void addTrain(Trains train) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(train);
	}

	@Override
	@Transactional
	public List<Trains> getTrain() {
			Session currentSession = sessionFactory.getCurrentSession();
		//	Query<Staff> createQuery = (Query<Staff>) currentSession.createQuery("from staff");
			List<Trains> trainList = currentSession.createQuery("from trains").list();
			return trainList;
	}



	

}
