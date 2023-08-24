package com.shriIT.userApp.controller;

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

import com.shriIT.userApp.model.User;
import com.shriIT.userApp.service.UserServiceI;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserServiceI iServiceI;
	
	
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user){
		
		User saveUser = iServiceI.saveUser(user);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
		
		
	}
	
	@GetMapping("/{userID}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userID){
		
		User user = iServiceI.getUser(userID);
		
		return ResponseEntity.ok(user);
		
	}
	
	@GetMapping("/getallUser")
	public ResponseEntity<List<User>> getAllUser(){
		
		List<User> allUser = iServiceI.getAllUser();
		
		return ResponseEntity.ok(allUser);
	}

}
