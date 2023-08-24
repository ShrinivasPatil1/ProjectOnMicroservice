package com.shriIT.userApp.serviceIMPL;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shriIT.userApp.Exceptions.ResourceNotFoundException;
import com.shriIT.userApp.model.User;
import com.shriIT.userApp.repositories.UserRepo;
import com.shriIT.userApp.service.UserServiceI;

@Service
public class UserServiceIMPL implements UserServiceI{
	@Autowired
	private UserRepo userRepo;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		
		String string = UUID.randomUUID().toString();
		user.setUserId(string);
		
		User save = userRepo.save(user);
		return save;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		
		List<User> findAll = userRepo.findAll();
		
		return findAll;
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		
		User user = userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("user not find with ID !! :"+userId));
		return user;
	}
	

}
