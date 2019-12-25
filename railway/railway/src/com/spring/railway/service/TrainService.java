package com.spring.railway.service;


import java.util.List;

import com.spring.railway.model.Trains;

public interface TrainService {

	void addTrain( Trains train);

	List<Trains> getTrains();
	
}
