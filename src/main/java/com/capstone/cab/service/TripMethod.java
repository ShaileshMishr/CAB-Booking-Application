package com.capstone.cab.service;

import java.util.List;

import com.capstone.cab.exceptions.BookingException;
import com.capstone.cab.model.Invoice;
import com.capstone.cab.model.TripDetails;


public interface TripMethod {

	boolean  insertTripDetails(TripDetails tripDetails) throws BookingException;
	
	//public TripDetails updateTriptDetails(TripDetails tripDetails, Integer tripBookedId);
	
	public TripDetails deleteTripDetails(Integer tripBookingId);
	
	public List<TripDetails> getAllTripDetailsOfACustomer(Integer customerId);
	

	
}
