package com.shriIT.hotelApp.servicesImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shriIT.hotelApp.entity.Hotel;
import com.shriIT.hotelApp.exception.ResourceNotFoundException;
import com.shriIT.hotelApp.repository.HotelRepo;
import com.shriIT.hotelApp.services.HotelServiceI;

@Service
public class HotelserviceIMPL implements HotelServiceI{

	@Autowired
	private HotelRepo hotelRepo;
	
	
	@Override
	public Hotel creteHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		
		String string = UUID.randomUUID().toString();
		
		hotel.setHotelID(string);
		
		Hotel save = hotelRepo.save(hotel);
		return save;
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		List<Hotel> findAll = hotelRepo.findAll();
		
		return findAll;
	}

	@Override
	public Hotel getHotel(String id) {
		// TODO Auto-generated method stub
		
		Hotel hotel = hotelRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel with given id not found"));
		return hotel;
	}

	
}
