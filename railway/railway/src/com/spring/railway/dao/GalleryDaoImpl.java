package com.spring.railway.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.railway.model.Gallery;


@Repository
public class GalleryDaoImpl implements GalleryDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Gallery> getProfilePics(String username) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Gallery>getUserQuery = (Query<Gallery>) currentSession.createQuery(" from gallery where username=:username");
		getUserQuery.setParameter("username", username);
		List<Gallery> pics = getUserQuery.getResultList();
		
		return pics;
	}
	@Override
	@Transactional
	public void addGallery(Gallery gallery) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(gallery);
	}

}
