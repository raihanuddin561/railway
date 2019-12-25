package com.spring.railway.dao;

import java.util.List;

import com.spring.railway.model.Stations;
import com.spring.railway.model.Trains;

public interface StationDao {
	List<Stations> getStation(); 
	void addStation(Stations station);
}
