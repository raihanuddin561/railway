package com.spring.railway.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="diparture")
@Table(name="diparture")
public class Diparture implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int did;
	private int trainNo;
	private String fromStation;
	private String toStation;
	private String startTime;
	private String reachTime;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	
	public String getFromStation() {
		return fromStation;
	}
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	public String getToStation() {
		return toStation;
	}
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getReachTime() {
		return reachTime;
	}
	public void setReachTime(String reachTime) {
		this.reachTime = reachTime;
	}
	
	
	
}
