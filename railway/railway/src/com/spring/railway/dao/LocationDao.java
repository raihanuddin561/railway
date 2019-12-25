package com.spring.railway.dao;

import java.util.List;

import com.spring.railway.model.Location;


public interface LocationDao {
	List<Location> getLocation();
	
	void addLocation(Location location);
}
