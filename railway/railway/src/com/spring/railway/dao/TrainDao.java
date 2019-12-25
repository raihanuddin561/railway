package com.spring.railway.dao;

import java.util.List;

import com.spring.railway.model.Trains;

public interface TrainDao {
	List<Trains> getTrain(); 
	void addTrain(Trains train);
	//List<Trains> getTrains();

}
