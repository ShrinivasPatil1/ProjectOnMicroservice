package com.shriIT.userApp.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.shriIT.userApp.Payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotException(ResourceNotFoundException ex){
		
		String message = ex.getMessage();
		
		ApiResponse apiResponse = new ApiResponse(message,true,HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND );
		
	}

}
