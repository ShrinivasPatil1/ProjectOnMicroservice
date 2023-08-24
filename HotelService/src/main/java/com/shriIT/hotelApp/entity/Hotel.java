package com.shriIT.hotelApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel {
	
	@Id
	private String hotelID;
	
	private String hotelName;
	
	private String location;
	private String about;
	public String getHotelID() {
		return hotelID;
	}
	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelID, String hotelName, String location, String about) {
		super();
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.location = location;
		this.about = about;
	}
	
	
	
	

}
