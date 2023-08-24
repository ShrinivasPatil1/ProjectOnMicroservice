package com.shriIT.hotelApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shriIT.hotelApp.entity.Hotel;
import com.shriIT.hotelApp.services.HotelServiceI;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired
	private HotelServiceI hotelServiceI;
	@PostMapping("/")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		
		Hotel creteHotel = this.hotelServiceI.creteHotel(hotel);
		
		return new ResponseEntity<Hotel>(creteHotel,HttpStatus.CREATED);
		
	}
	

	@GetMapping("/{hotelID}")
	public ResponseEntity<Hotel> getHotel(@PathVariable String hotelID){
		
		Hotel hotel = this.hotelServiceI.getHotel(hotelID);
		
		return new ResponseEntity<Hotel>(hotel,HttpStatus.OK);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Hotel>> getAllHotel(){
		
		List<Hotel> allHotel = this.hotelServiceI.getAllHotel();
		
		return new ResponseEntity<List<Hotel>>(allHotel,HttpStatus.OK);
		
	}

}
