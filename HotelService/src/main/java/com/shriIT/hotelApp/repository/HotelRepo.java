package com.shriIT.hotelApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shriIT.hotelApp.entity.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, String>{

}
