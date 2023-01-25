package com.capstone.cab.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capstone.cab.exceptions.CustomerException;
import com.capstone.cab.model.Admin;
import com.capstone.cab.model.Customer;
import com.capstone.cab.model.Driver;
import com.capstone.cab.service.DriverService;
import com.capstone.cab.service.LoginService;

@Controller
public class DriverController {

	@Autowired
	LoginService service;
	@Autowired
	DriverService dservice;
	
	@RequestMapping(value = "/driver", method = RequestMethod.GET)
	public ModelAndView displayHello() {
		ModelAndView mav = new ModelAndView("driverlogin");
		mav.addObject("message", "LOGIN PAGE!");
		//map.addAttribute("message", "LOGIN PAGE!");
		return mav;
	}
	
	@RequestMapping(value = "/driverhome", method = RequestMethod.GET)
	public ModelAndView displayHello1() {
		ModelAndView mav = new ModelAndView("DriverHome");
		mav.addObject("message", "LOGIN PAGE!");
		//map.addAttribute("message", "LOGIN PAGE!");
		return mav;
	}
	
	@RequestMapping(value = "/driverLogin", method = RequestMethod.POST)
	public ModelAndView displayDriver(ModelMap map, HttpServletRequest request  ,@ModelAttribute("driver") Driver driver,HttpSession session) {
		
		
		String userName = request.getParameter("dname");
		String password = request.getParameter("dpwd");
		int driverId=dservice.getDriverId(userName, password);
		
		if(service.validateDriver(userName, password)) {
			map.addAttribute("dname",userName);
			map.addAttribute("driverId",driverId);
			session.setAttribute("dname", userName);
			session.setAttribute("dpwd", password);
			//ModelAndView mav1 = new ModelAndView("product");
			//List<Cab> cabs= pservice.getProducts();
			//mav1.addObject("allProducts", products);
			ModelAndView mav1 = new ModelAndView("DriverHome");
			return mav1;
			}
		
		else if(userName.equals("") || password.equals("") ) {
			ModelAndView mav2 = new ModelAndView("error");
			return mav2;
			
		}
		
else {
	ModelAndView mav3 = new ModelAndView("fail");
	return mav3;
	}

	}
	
	//### Add New Driver ###
	
			@RequestMapping(value="/addtodriver" ,method=RequestMethod.POST)
			public String save(Model map, HttpServletRequest request) {
				Driver driver = new Driver();
				String name= request.getParameter("name");
				String email= request.getParameter("email");
				String mobile= request.getParameter("mob");
				String licence= request.getParameter("lic");
				String password= request.getParameter("pass");
				String address= request.getParameter("add");
				
				driver.setUserName(name);
				driver.setEmail(email);
				driver.setMobile(mobile);
				driver.setLicenceNo(licence);
				driver.setPassword(password);
				driver.setAddress(address);
				
				dservice.save(driver);
				map.addAttribute("userText", "Driver data saved Successfully");
				return "login";
				
			}
			
			//### View Driver ###
			
			@RequestMapping(value="/getDriver" ,method=RequestMethod.GET)
			public String getVal(Model map, HttpServletRequest request,HttpSession session) {
				String userName = (String) session.getAttribute("dname");
				String password = (String) session.getAttribute("dpwd");
				int driverId=dservice.getDriverId(userName, password);
				
				Driver driver = dservice.getDriver(driverId);
				
				map.addAttribute("dname", driver.getUserName());
				map.addAttribute("dId", driver.getDriverId());
				map.addAttribute("demail", driver.getEmail());
				map.addAttribute("dmob", driver.getMobile());
				map.addAttribute("dlic", driver.getLicenceNo());
				map.addAttribute("daddr", driver.getAddress());
				return "DriverData";
				
			}
			
			//### Delete driver ###
			
			@RequestMapping(value="/deletedriver" ,method=RequestMethod.GET)
			public  String deleteDriver(Model map,HttpSession session){
				String userName = (String) session.getAttribute("dname");
				String password = (String) session.getAttribute("dpwd");
				int driverId=dservice.getDriverId(userName, password);
				dservice.deleteDriver(driverId);
				return "login";
				
			}
	
}
