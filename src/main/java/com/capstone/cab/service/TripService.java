package com.capstone.cab.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.cab.exceptions.BookingException;
import com.capstone.cab.exceptions.DriverException;
import com.capstone.cab.model.Customer;
import com.capstone.cab.model.Driver;
import com.capstone.cab.model.Invoice;
import com.capstone.cab.model.TripDetailDTO;
import com.capstone.cab.model.TripDetails;
import com.capstone.cab.repository.CustomerRepo;
import com.capstone.cab.repository.DriverRepo;
import com.capstone.cab.repository.TripDataRepo;

@Service
public class TripService implements TripMethod {

	@Autowired
	private TripDataRepo ticketDao;

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private DriverRepo driverRepo;

//	/*
//	 * @Override public TripDetails insertTicketDetails(TripDetailDTO
//	 * ticketDetail)throws BookingException {
//	 * 
//	 * if( ticketDetail.getFromDate().isAfter(LocalDate.now().minusDays(1)) &&
//	 * ticketDetail.getFromDate().isBefore(ticketDetail.getToDate().plusDays(1))) {
//	 * 
//	 * Optional<Customer> optional =
//	 * customerRepo.findById(ticketDetail.getCustomerId()); List<Driver> driverList=
//	 * driverRepo.findAll(); Driver availableDriver = null;
//	 * 
//	 * for(Driver driver : driverList) {
//	 * 
//	 * if(driver.isAvailable()) { availableDriver = driver; break; }
//	 * 
//	 * }
//	 * 
//	 * if(availableDriver == null);
//	 * 
//	 * Double rateperKM = (double) availableDriver.getCab().getPerKmRate();
//	 * 
//	 * availableDriver.setAvailable(false); // marking driver as booked
//	 * 
//	 * Customer existCustomer = optional.get();
//	 * 
//	 * TripDetails data = new TripDetails();
//	 * 
//	 * data.setCustomer(existCustomer); // adding customer to trip detail
//	 * 
//	 * List<TripDetails> tripList = existCustomer.getTriplist(); // getting trip
//	 * list from customer
//	 * 
//	 * Double distance = Math.floor(Math.random()*(100 - 3 + 1)+ 3); //Random
//	 * Distance finder
//	 * 
//	 * data.setStartingLocation(ticketDetail.getStartingLocation());
//	 * 
//	 * data.setDestination(ticketDetail.getDestination());
//	 * 
//	 * data.setDate(LocalDate.now());
//	 * 
//	 * data.setTime(LocalTime.now());
//	 * 
//	 * data.setBill(rateperKM * distance);
//	 * 
//	 * data.setCabId(availableDriver.getCab().getCabId());
//	 * 
//	 * data.setCarType(availableDriver.getCab().getCarType());
//	 * 
//	 * data.setDistanceInKM(distance);
//	 * 
//	 * data.setCabdriver(availableDriver);
//	 * 
//	 * tripList.add(data); // adding trip data to customers trip list.
//	 * 
//	 * availableDriver.getTripList().add(data); // adding trip data to driver's
//	 * list;
//	 * 
//	 * return ticketDao.save(data);
//	 * 
//	 * } throw new BookingException("please provide a valid date");
//	 * 
//	 * }
//	 */

	@Override
	public TripDetails insertTicketDetails(TripDetailDTO ticketDetail) throws BookingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TripDetails updateTicketDetails(TripDetailDTO ticketDetails, Integer tripBookedId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TripDetails deleteTicketDetails(Integer tripBookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripDetails> getAllTripDetailsOfACustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
