package com.capstone.cab.exceptions;

public class BookingException extends Exception {

	private static final long serialVersionUID = 1L;

	public BookingException() {
            //No argument Constructor
	}
	public BookingException(String message) {
        super(message);
	}
	
}
