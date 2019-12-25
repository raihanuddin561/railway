package com.spring.railway.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="scheduling")
@Table(name="scheduling")
public class Scheduling {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serial;
	private String startingStation;
	private String scheduleStation;
	private String schedule;
	private String destination;
	private String offDay;
	@OneToOne(cascade = CascadeType.ALL)
	private Trains trains;
	
	public Scheduling() {
		
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getStartingStation() {
		return startingStation;
	}

	public void setStartingStation(String startingStation) {
		this.startingStation = startingStation;
	}

	public String getScheduleStation() {
		return scheduleStation;
	}

	public void setScheduleStation(String scheduleStation) {
		this.scheduleStation = scheduleStation;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getOffDay() {
		return offDay;
	}

	public void setOffDay(String offDay) {
		this.offDay = offDay;
	}

	public Trains getTrains() {
		return trains;
	}

	public void setTrains(Trains trains) {
		this.trains = trains;
	}

	


	
	

}
