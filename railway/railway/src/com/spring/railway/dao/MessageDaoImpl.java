package com.spring.railway.dao;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.railway.model.Messages;
import com.spring.railway.model.Scheduling;
@Repository
public class MessageDaoImpl implements MessageDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public void sendMessage(Messages messages) {
		Session currentSession = sessionFactory.getCurrentSession();
		String time = new Date().toString();
		messages.setTime(time);
		messages.setStatus("unseen");
		currentSession.saveOrUpdate(messages);
		
	}


	@Override
	@Transactional
	public List<Messages> getMessage(String reciever) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Messages> createQuery = currentSession.createQuery("from messages where receiver=:receiver or sender=:receiver order by mid desc");
		createQuery.setParameter("receiver", reciever);
		List<Messages> messages = createQuery.getResultList();
		return messages;
	}

}
