package com.capstone.cab.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.cab.exceptions.BookingException;
import com.capstone.cab.exceptions.DriverException;
import com.capstone.cab.model.Cab;
import com.capstone.cab.model.Customer;
import com.capstone.cab.model.Driver;
import com.capstone.cab.model.Invoice;
import com.capstone.cab.model.TripDetails;
import com.capstone.cab.repository.CustomerRepo;
import com.capstone.cab.repository.DriverRepo;
import com.capstone.cab.repository.TripDataRepo;

@Service
public class TripService implements TripMethod {

	@Autowired
	private TripDataRepo triprepo;

	

	
//	 @Override public TripDetails insertTicketDetails(TripDetailDTO ticketDetail)throws BookingException {
//	  
//	  if( ticketDetail.getFromDate().isAfter(LocalDate.now().minusDays(1)) &&
//	  ticketDetail.getFromDate().isBefore(ticketDetail.getToDate().plusDays(1))) {
//	  
//	  Optional<Customer> optional = customerRepo.findById(ticketDetail.getCustomerId()); List<Driver> driverList=
//	  driverRepo.findAll(); Driver availableDriver = null;
//	  
//	  for(Driver driver : driverList) {
//	  
//	  if(driver.isAvailable()) { availableDriver = driver; break; }
//	  
//	  }
//	  
//	  if(availableDriver == null);
//	  
//	  Double rateperKM = (double) availableDriver.getCab().getPerKmRate();
//	  
//	  availableDriver.setAvailable(false); 
//	  
//	  Customer existCustomer = optional.get();
//	  
//	  TripDetails data = new TripDetails();
//	  
//	  data.setCustomer(existCustomer); 
//	  
//	  List<TripDetails> tripList = existCustomer.getTriplist(); 
//	  
//	  Double distance = Math.floor(Math.random()*(100 - 3 + 1)+ 3); 
//	  
//	  data.setStartingLocation(ticketDetail.getStartingLocation());
//	  
//	  data.setDestination(ticketDetail.getDestination());
//	  
//	  data.setDate(LocalDate.now());
//	  
//	  data.setTime(LocalTime.now());
//	  
//	  data.setBill(rateperKM * distance);
//	  
//	  data.setCabId(availableDriver.getCab().getCabId());
//	  
//	  data.setCarType(availableDriver.getCab().getCarType());
//	  
//	  data.setDistanceInKM(distance);
//	  
//	  data.setCabdriver(availableDriver);
//	  
//	  tripList.add(data); 
//	  
//	  availableDriver.getTripList().add(data); 
//	  
//	  return ticketDao.save(data);
//	  
//	  } throw new BookingException("please provide a valid date");
//	  
//	  }
//	 
	
	// Get all trips
public List<TripDetails> getTrips(){
		
		List<TripDetails> trip = (List<TripDetails>)triprepo.findAll();
			return trip;
		}
		
	public void saveTrips(TripDetails tdetail) {
		triprepo.save(tdetail);
	}
	
	
	// Insert Trip
	@Override
	public boolean insertTripDetails(TripDetails tripDetails) throws BookingException {
		
		TripDetails c1 = triprepo.save(tripDetails);
		if(c1 != null)
			return true;
		else {
			return false;
		}
	}
	


	@SuppressWarnings("unchecked")
	@Override
	public List<TripDetails> getAllTripDetailsOfACustomer(Integer customerId) {
		return (List<TripDetails>) triprepo.findById(customerId).get();
		
	}

	

//	@Override
//	public TripDetails updateTriptDetails(TripDetails tripDetails, Integer tripBookedId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	
	// Update trip
	public void editTrips(TripDetails tripDetails) {
		Integer tripBookedId = tripDetails.getTripBookingId();
		triprepo.deleteById(tripBookedId);
		triprepo.save(tripBookedId);
	}

	// Delete Trip
	@Override
	public TripDetails deleteTripDetails(Integer tripBookingId) {
		Optional<TripDetails> opt= triprepo.findById(tripBookingId);
		
		if(opt.isPresent()) {
			
			TripDetails existingCab= opt.get();
			triprepo.delete(existingCab);
			
			return existingCab;
			
		}else {
			}
		return null;
	}

	

}
