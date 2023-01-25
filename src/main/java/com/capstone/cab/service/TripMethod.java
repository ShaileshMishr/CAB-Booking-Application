package com.capstone.cab.service;

import java.util.List;

import com.capstone.cab.exceptions.BookingException;
import com.capstone.cab.model.Invoice;
import com.capstone.cab.model.TripDetailDTO;
import com.capstone.cab.model.TripDetails;


public interface TripMethod {

	public TripDetails insertTicketDetails(TripDetailDTO ticketDetail) throws BookingException;
	
	public TripDetails updateTicketDetails(TripDetailDTO ticketDetails, Integer tripBookedId);
	
	public TripDetails deleteTicketDetails(Integer tripBookingId);
	
	public List<TripDetails> getAllTripDetailsOfACustomer(Integer customerId);
	
	public Invoice getInvoiceDetails(Integer customerId);

	
}
