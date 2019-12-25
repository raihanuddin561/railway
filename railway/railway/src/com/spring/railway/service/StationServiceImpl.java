package com.spring.railway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.railway.dao.StationDao;
import com.spring.railway.model.Stations;
@Service
public class StationServiceImpl implements StationService {
	@Autowired
	private StationDao stationDao;
	@Override
	public void addStation(Stations station) {
		stationDao.addStation(station);
		
	}
	@Override
	public List<Stations> getStations() {
		// TODO Auto-generated method stub
		return stationDao.getStation();
	}

}
