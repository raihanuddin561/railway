package com.spring.railway.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.railway.model.Diparture;
import com.spring.railway.model.Scheduling;
import com.spring.railway.model.Stations;

@Repository
public class ScheduleDaoImpl implements ScheduleDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void addSchedule(Scheduling scheduling) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(scheduling);

	}

	@Override
	@Transactional
	public List<Scheduling> getSchedule(String stationName) {
		Session currentSession = sessionFactory.getCurrentSession();
		// List<Scheduling> schedule = currentSession.createQuery("from scheduling where
		// scheduleStation =:scheduleStation").list();
		/*
		 * String sql =
		 * "select stud.firstname,stud.roll,sub.subjectname,cls.classname,exam.exam_name,exam.from_time,e"
		 * +
		 * "xam.to_time,exam.exam_date from Student stud,Subject sub,Classs cls,Exam exam where exam.classs=cls.id "
		 * +
		 * "and exam.subject=sub.id and sub.classs=cls.id and stud.classs=cls.id and stud.roll= :roll"
		 * ;
		 */
		Query<Scheduling> createQuery = currentSession.createQuery("from scheduling where scheduleStation=:scheduleStation");
		createQuery.setParameter("scheduleStation", stationName);
		List<Scheduling> schedule = createQuery.getResultList();
		return schedule;

	}

}
