package com.shriIT.userApp.Exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException() {
		super("Resource not found excetion !!"); 
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
