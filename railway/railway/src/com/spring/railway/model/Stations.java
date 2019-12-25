package com.spring.railway.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="stations")
@Table(name="stations")
public class Stations implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stationNo;
	private String stationName;
	public int getStationNo() {
		return stationNo;
	}
	public void setStationNo(int stationNo) {
		this.stationNo = stationNo;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	
	
}
