package com.spring.railway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.railway.dao.ScheduleDao;
import com.spring.railway.model.Scheduling;
@Service
public class ScheduleServiceImpl implements ScheduleService {
	@Autowired
	private ScheduleDao scheduleDao;

	@Override
	public void addSchedule(Scheduling scheduling) {
		scheduleDao.addSchedule(scheduling);

	}

	@Override
	public List<Scheduling> getSchedule(String stationName) {
		// TODO Auto-generated method stub
		return scheduleDao.getSchedule(stationName);
	}

}
