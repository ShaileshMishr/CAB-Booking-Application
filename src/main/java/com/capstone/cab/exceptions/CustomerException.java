package com.capstone.cab.exceptions;

public class CustomerException extends Exception {
	
	static final long serialVersionUID = 1L;

	public CustomerException() {
            //No argument Constructor
	}
	public CustomerException(String message) {
        super(message);
	}
}
