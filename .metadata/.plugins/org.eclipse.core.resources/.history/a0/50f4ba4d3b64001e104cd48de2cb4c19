package com.example.employee.exception;

import javax.naming.NameNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class exceptions {
	
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<String> namehandler(NameNotFoundException m) {
		return new ResponseEntity<String>(m.getMessage(),HttpStatus.NOT_FOUND);
	}
}
