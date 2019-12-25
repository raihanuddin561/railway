package com.spring.railway.service;

import java.util.List;

import javax.validation.Valid;

import com.spring.railway.model.Stations;

public interface StationService {

	void addStation( Stations station);

	List<Stations> getStations();

}
