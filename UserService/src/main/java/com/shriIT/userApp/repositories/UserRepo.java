package com.shriIT.userApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shriIT.userApp.model.User;

public interface UserRepo extends JpaRepository<User, String>{
	
	

}
