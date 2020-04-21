package com.springboot.service.exception;

public class AccountNotFoundException extends Exception {
	private static final long serialVersionUID = 1L; 
	private String message; 

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AccountNotFoundException(String message) { 
		// TODO Auto-generated constructor stub 
		super(message); 
	} 



}
