package com.spring.railway.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "trains")
@Table(name = "trains")
public class Trains implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainId;
	private String trainNo;
	private String trainName;

	public Trains() {

	}

	

	public int getTrainId() {
		return trainId;
	}



	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}



	public String getTrainNo() {
		return trainNo;
	}



	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}



	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	

}
