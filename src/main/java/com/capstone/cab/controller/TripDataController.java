//package com.capstone.cab.controller;
//
//import java.time.LocalDate;
//import java.util.Date;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.capstone.cab.exceptions.BookingException;
//import com.capstone.cab.model.Cab;
//import com.capstone.cab.model.TripDetailDTO;
//import com.capstone.cab.model.TripDetails;
//import com.capstone.cab.repository.CabRepo;
//import com.capstone.cab.service.CustomerService;
//import com.capstone.cab.service.TripService;
//
//
//
//@Controller
//public class TripDataController {
//	
//	@Autowired
//	private TripService ticketService;
//	
//	@Autowired
//	CustomerService cservice;
//	
//	@Autowired
//	CabRepo cabrepo;
//	
//	// ### AddTrip ###
//
//	@RequestMapping(value = "/addTrip", method = RequestMethod.POST)
//	public String save(@RequestParam int cabId,Model map, HttpServletRequest request,HttpSession session) throws BookingException {
//		
//		String userName = (String) session.getAttribute("uname");
//		String password = (String) session.getAttribute("pwd");
//		int customerId = cservice.getCustomerId(userName, password);
//		
//		Cab cab =cabrepo.findById(cabId).get(); 
//		TripDetailDTO tripdetails = new TripDetailDTO();
//		
//		String sloc = request.getParameter("sloc");
//		String destination = request.getParameter("destination");
//		String mobile = request.getParameter("mobile");
//		LocalDate fromdate = LocalDate.parse(request.getParameter("fromdate"));
//		LocalDate todate = LocalDate.parse(request.getParameter("todate"));
//		Integer customerId1=Integer. parseInt(request.getParameter("customerId"));
//		
//		tripdetails.setStartingLocation(sloc);
//		tripdetails.setDestination(destination);
//		tripdetails.setMobileNumber(mobile);
//		tripdetails.setFromDate(fromdate);
//		tripdetails.setToDate(todate);
//		tripdetails.setCustomerId(customerId1);
//		
//		cabrepo.save(cab);
//		ticketService.insertTicketDetails(tripdetails);
//		
//		map.addAttribute("ride", "Ride Booked Successfully");
//		return "sucess";
//		
//	}
//
//
//}
