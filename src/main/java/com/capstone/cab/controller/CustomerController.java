package com.capstone.cab.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capstone.cab.exceptions.CustomerException;
import com.capstone.cab.model.Cab;
import com.capstone.cab.model.Customer;
import com.capstone.cab.repository.CustomerRepo;
import com.capstone.cab.service.CustomerService;
import com.capstone.cab.service.LoginService;




@Controller
public class CustomerController {

	@Autowired
	LoginService service;
	
	@Autowired
	CustomerService cservice;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "LOGIN PAGE!");
		//map.addAttribute("message", "LOGIN PAGE!");
		return mav;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView Main() {
		ModelAndView mav8 = new ModelAndView("home");
		mav8.addObject("message", "HOME PAGE!");
		//map.addAttribute("message", "LOGIN PAGE!");
		return mav8;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayHello() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("message", "LOGIN PAGE!");
		//map.addAttribute("message", "LOGIN PAGE!");
		return mav;
	}
	
	@RequestMapping(value = "/customerhome", method = RequestMethod.GET)
	public ModelAndView displayHello1() {
		ModelAndView mav = new ModelAndView("CustomerHome");
		mav.addObject("message", "LOGIN PAGE!");
		//map.addAttribute("message", "LOGIN PAGE!");
		return mav;
	}
	
	// Login Process
	@RequestMapping(value = "/processLogin", method = RequestMethod.POST)
	public ModelAndView displayCustomer(ModelMap map, HttpServletRequest request  ,@ModelAttribute("customer") Customer customer) {
		
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		int customerId=cservice.getCustomerId(userName, password);
		
		if(service.validateCustomer(userName, password)) {
			map.addAttribute("name",userName);
			map.addAttribute("customerId",customerId);
			//ModelAndView mav1 = new ModelAndView("product");
			//List<Cab> cabs= pservice.getProducts();
			//mav1.addObject("allProducts", products);
			ModelAndView mav1 = new ModelAndView("CustomerHome");
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
	

	
	//### Add New customer ###
	
	@RequestMapping(value="/addtocustomer" ,method=RequestMethod.POST)
	public String save(Model map, HttpServletRequest request) throws CustomerException {
		Customer customer = new Customer();
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String mobile= request.getParameter("mob");
		String password= request.getParameter("pass");
		String address= request.getParameter("add");
		
		customer.setUserName(name);
		customer.setEmail(email);
		customer.setMobile(mobile);
		customer.setPassword(password);
		customer.setAddress(address);
		
		cservice.insertCustomer(customer);
		map.addAttribute("userText", "Customer data saved Successfully");
		return "sucess";
		
	}
	
	//### View customer ###
	
	@RequestMapping(value="/getCustomer" ,method=RequestMethod.GET)
	public String getVal(Model map, HttpServletRequest request) {
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		//int customerId=cservice.getCustomerId(userName, password);
		int customerId = 102;
		Customer customer = cservice.getCustomer(customerId);
		
		map.addAttribute("cname", customer.getUserName());
		map.addAttribute("cId", customer.getCustomerId());
		map.addAttribute("cemail", customer.getEmail());
		map.addAttribute("cmob", customer.getMobile());
		map.addAttribute("caddr", customer.getAddress());
		return "CusData";
		
	}
	
	

}
