package com.spring.railway.service;

import java.util.List;

import javax.validation.Valid;

import com.spring.railway.model.Diparture;

public interface DepartureService {

	void addDiparture( Diparture diparture);

	List<Diparture> getDiparture();

	List<Diparture> getDiparture(String station);

}
