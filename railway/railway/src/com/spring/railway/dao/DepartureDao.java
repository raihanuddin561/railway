package com.spring.railway.dao;

import java.util.List;

import com.spring.railway.model.Diparture;
import com.spring.railway.model.Trains;

public interface DepartureDao {
	List<Diparture> getDiparture(); 
	void addDiparture(Diparture diparture);
	List<Diparture> getDiparture(String station);
}
