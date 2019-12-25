package com.spring.railway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.railway.dao.DepartureDao;
import com.spring.railway.model.Diparture;
@Service
public class DepartureServiceImpl implements DepartureService{
@Autowired
private DepartureDao departureDao;
	@Override
	public void addDiparture(Diparture diparture) {
		departureDao.addDiparture(diparture);
		
	}
	@Override
	public List<Diparture> getDiparture() {
		// TODO Auto-generated method stub
		return departureDao.getDiparture();
	}
	@Override
	public List<Diparture> getDiparture(String station) {
		// TODO Auto-generated method stub
		return departureDao.getDiparture(station);
	}

}
