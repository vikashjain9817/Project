package com.signup.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.signup.exceptions.DuplicateRegistrationException;
import com.signup.exceptions.NoDataFoundException;



@ControllerAdvice
public class SignupExceptionHandler  extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(value = DuplicateRegistrationException.class)
	public ResponseEntity<Object> duplicateRegistrationException(DuplicateRegistrationException e)
	{
		return new ResponseEntity<>(e.getMessage(),HttpStatus.ALREADY_REPORTED);
	}
	
	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<Object> noDataFoundException(NoDataFoundException e)
	{
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
