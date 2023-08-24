package com.shriIT.hotelApp.services;

import java.util.List;

import com.shriIT.hotelApp.entity.Hotel;

public interface HotelServiceI {
	
	Hotel creteHotel(Hotel hotel);
	
	List<Hotel> getAllHotel();
	
	Hotel getHotel(String id);

}
