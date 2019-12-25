package com.spring.railway.dao;

import java.util.List;

import com.spring.railway.model.Scheduling;

public interface ScheduleDao {
	public void addSchedule(Scheduling scheduling);

	public List<Scheduling> getSchedule(String stationName);
}
