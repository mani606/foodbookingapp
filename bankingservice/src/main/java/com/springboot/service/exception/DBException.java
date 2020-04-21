package com.springboot.service.exception;

public class DBException extends Exception {

	private static final long serialVersionUID = -3250526797396148102L; 

	private String message; 

	private Exception ex;



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Exception getEx() {
		return ex;
	}

	public void setEx(Exception ex) {
		this.ex = ex;
	}


	public DBException() {
		super();
	}

	public DBException(String message, Exception ex) {
		super();
		this.message = message;
		this.ex = ex;
	} 



}
