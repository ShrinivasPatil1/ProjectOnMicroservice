package com.shriIT.userApp.service;

import java.util.List;

import com.shriIT.userApp.model.User;



public interface UserServiceI {
	
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);
	
	

}
