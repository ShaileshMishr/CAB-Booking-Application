package com.capstone.cab.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capstone.cab.model.Cab;
import com.capstone.cab.model.Customer;
import com.capstone.cab.service.AdminService;
import com.capstone.cab.service.CabService;
import com.capstone.cab.service.CustomerService;

public class CabController {

	@Autowired
	AdminService aservice;
	
	
	@Autowired
	CabService cabservice;
	
	
//	// Add Cab
//			@RequestMapping(value="/addtocab" ,method=RequestMethod.POST)
//			public String insertcab(Model map, HttpServletRequest request, HttpSession session) {
//				String userName = (String) session.getAttribute("aname");
//			String password = (String) session.getAttribute("apwd");
//				int adminId=aservice.getAdminId(userName, password);
//				
//				Cab cab =  new Cab();
//				
//				String type= request.getParameter("type");
//				int rate=  Integer.parseInt(request.getParameter("rate"));
//				
//				cab.setCarType(type);
//				cab.setPerKmRate(rate);
//				//cab.setDiver(null);
//				
//				
//				cabservice.insertCab(cab);
//				map.addAttribute("userText", "Cab data saved Successfully");
//				return "AdminHome";
//				
//			}
//			
//			// Delete All Cab
//			
//			@RequestMapping(value="/deletecablist/{cabId}" ,method=RequestMethod.GET)
//			public  String deleteCablist(@PathVariable("cabId") Integer cabId,Model map,HttpSession session){
//
//				String userName = (String) session.getAttribute("aname");
//				String password = (String) session.getAttribute("apwd");
//				int adminId=aservice.getAdminId(userName, password);
//				
//				Cab cab = cabservice.deleteCab(cabId);
//		        map.addAttribute("cabId", cab.getCabId());
//				  cabservice. deleteCab(cabId);
//				return "AdminHome";
//				
//			}
			
			// Update Cabs
//			@RequestMapping(value="/updatecablist/{cabId}/{carType}/{perKmRate}" ,method=RequestMethod.GET)
//			public  String updateCablist(@PathVariable("cabId") Integer cabId,@PathVariable("carType") String carType,@PathVariable("perKmRate") Integer perKmRate,Model map,HttpSession session){
//
//				String userName = (String) session.getAttribute("aname");
//				String password = (String) session.getAttribute("apwd");
//				int adminId=aservice.getAdminId(userName, password);
//				
//				
//				 map.addAttribute("cabId", cabId);
//			        map.addAttribute("carType", carType);
//			        map.addAttribute("perKmRate",perKmRate);
//			       
//				return "CabUpdate";
//				
//			}
//			
//
//			@RequestMapping(value="/updatecab", method = RequestMethod.POST)
//			public String updateProduct(ModelMap map, @ModelAttribute("cab") Cab cab) {
//				
//				cabservice.updateCab(cab);
//				return "AdminHome";
//				
//			}	
				
}
