package com.spring.railway.service;

import java.util.List;

import com.spring.railway.model.Scheduling;

public interface ScheduleService {
	public void addSchedule(Scheduling scheduling);

	public List<Scheduling> getSchedule(String stationName);

}
