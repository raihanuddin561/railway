package com.spring.railway.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.railway.dao.TrainDao;
import com.spring.railway.model.Trains;
@Service
public class TrainServiceImpl implements TrainService {
	@Autowired
	private TrainDao trainDao;

	@Override
	public void addTrain( Trains train) {
		trainDao.addTrain(train);
		
	}

	@Override
	public List<Trains> getTrains() {
		// TODO Auto-generated method stub
		return trainDao.getTrain(); 
	}
	
	

}
