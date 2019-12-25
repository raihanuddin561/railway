package com.spring.railway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.Valid;

import org.springframework.web.multipart.MultipartFile;

@Entity(name="location")
@Table(name="location")
public class Location {
	@Id
	@Column(name="location_id")
	private int locationId;
	@Column(name="location")
	private String location;
	
	@Column(name="pic")
	private String pic;
	
	@Transient
	private MultipartFile file;
	
	
	public Location() {
		
	}
	public Location(int locationId, String location) {
		super();
		this.locationId = locationId;
		this.location = location;
	}
	
	
	public Location(int locationId, String location, String pic) {
		super();
		this.locationId = locationId;
		this.location = location;
		this.pic = pic;
	}
	
	
	public Location(int locationId, String location, MultipartFile file) {
		super();
		this.locationId = locationId;
		this.location = location;
		this.file = file;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", location=" + location + ", pic=" + pic + "]";
	}
	
	
}
