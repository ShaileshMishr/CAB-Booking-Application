package com.capstone.cab.controller;

import java.util.List;

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
import com.capstone.cab.model.Cab;
import com.capstone.cab.model.Customer;
import com.capstone.cab.model.Driver;
import com.capstone.cab.service.AdminService;
import com.capstone.cab.service.CabService;
import com.capstone.cab.service.CustomerService;
import com.capstone.cab.service.DriverService;
import com.capstone.cab.service.LoginService;

@Controller
public class AdminController {

	@Autowired
	LoginService service;
	
	@Autowired
	AdminService aservice;
	
	@Autowired
	CustomerService cservice;
	
	@Autowired
	CabService cabservice;
	
	@Autowired
	DriverService dservice;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView displayHello() {
		ModelAndView mav = new ModelAndView("adminlogin");
		mav.addObject("message", "LOGIN PAGE!");
		//map.addAttribute("message", "LOGIN PAGE!");
		return mav;
	}
	
	@RequestMapping(value = "/adminhome", method = RequestMethod.GET)
	public ModelAndView displayHello1() {
		ModelAndView mav = new ModelAndView("AdminHome");
		mav.addObject("message", "LOGIN PAGE!");
		//map.addAttribute("message", "LOGIN PAGE!");
		return mav;
	}
	
	// Get All Customers
	
	@RequestMapping(value = "/allCustomer", method = RequestMethod.GET)
	public ModelAndView displayCustomer(HttpSession session) {
		String userName = (String) session.getAttribute("aname");
		String password = (String) session.getAttribute("apwd");
		int adminId=aservice.getAdminId(userName, password);
		
		ModelAndView mav = new ModelAndView("AllCustomer");
		List<Customer> customers= cservice.getCustomers();
		mav.addObject("allCustomers", customers);

		return mav;
	}
	
	// Get All Drivers
	
	@RequestMapping(value = "/allDriver", method = RequestMethod.GET)
	public ModelAndView displayDriver(HttpSession session) {
		String userName = (String) session.getAttribute("aname");
		String password = (String) session.getAttribute("apwd");
		int adminId=aservice.getAdminId(userName, password);
		
		ModelAndView mav = new ModelAndView("AllDriver");
		List<Driver> drivers= dservice.getDrivers();
		mav.addObject("allDrivers", drivers);

		return mav;
	}
	
	// Get All Cabs
	
	@RequestMapping(value = "/allCab", method = RequestMethod.GET)
	public ModelAndView displayCab(HttpSession session) {
		String userName = (String) session.getAttribute("aname");
		String password = (String) session.getAttribute("apwd");
		int adminId=aservice.getAdminId(userName, password);
		
		ModelAndView mav = new ModelAndView("AllCab");
		List<Cab> cabs= cabservice.getCabs();
		mav.addObject("allCabs", cabs);

		return mav;
	}
	
	
	
	@RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
	public ModelAndView displayDriver(ModelMap map, HttpServletRequest request  ,@ModelAttribute("admin") Admin admin, HttpSession session) {
		
		
		String userName = request.getParameter("aname");
		String password = request.getParameter("apwd");
		int adminId=aservice.getAdminId(userName, password);
		
		if(service.validateAdmin(userName, password)) {
			map.addAttribute("aname",userName);
			map.addAttribute("adminId",adminId);
			session.setAttribute("aname", userName);
			session.setAttribute("apwd", password);

			//ModelAndView mav1 = new ModelAndView("product");
			//List<Cab> cabs= pservice.getProducts();
			//mav1.addObject("allProducts", products);
			ModelAndView mav1 = new ModelAndView("AdminHome");
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
	
	//### Add New Admin ###
	
		@RequestMapping(value="/addtoadmin" ,method=RequestMethod.POST)
		public String save(Model map, HttpServletRequest request) {
			Admin admin = new Admin();
			String name= request.getParameter("name");
			String email= request.getParameter("email");
			String mobile= request.getParameter("mob");
			String password= request.getParameter("pass");
			String address= request.getParameter("add");
			
			admin.setUserName(name);
			admin.setEmail(email);
			admin.setMobile(mobile);
			admin.setPassword(password);
			admin.setAddress(address);
			
			aservice.save(admin);
			map.addAttribute("userText", "Admin data saved Successfully");
			return "login";
			
		}
	

		//### View Admin ###
		
		@RequestMapping(value="/getAdmin" ,method=RequestMethod.GET)
		public String getVal(Model map, HttpServletRequest request,HttpSession session) {
			String userName = (String) session.getAttribute("aname");
			String password = (String) session.getAttribute("apwd");
			int adminId=aservice.getAdminId(userName, password);
			//int adminId = 111;
			Admin admin = aservice.getAdmin(adminId);
			
			map.addAttribute("aname", admin.getUserName());
			map.addAttribute("aId", admin.getAdminId());
			map.addAttribute("aemail", admin.getEmail());
			map.addAttribute("amob", admin.getMobile());
			map.addAttribute("aaddr", admin.getAddress());
			return "AdminData";
			
		}
		
		//### Delete customer ###
		
		@RequestMapping(value="/deleteadmin" ,method=RequestMethod.GET)
		public  String deleteAdmin(Model map,HttpSession session){
			String userName = (String) session.getAttribute("aname");
			String password = (String) session.getAttribute("apwd");
			int adminId=aservice.getAdminId(userName, password);
			aservice.deleteAdmin(adminId);
			return "login";
			
		}
		
		
		
		//### Update Existing Driver ###
		
	    @RequestMapping(value = "/updateAdmin", method = RequestMethod.GET)
	    public String updateDriver(Model map, HttpServletRequest request, HttpSession session) {
	    	String userName = (String) session.getAttribute("aname");
			String password = (String) session.getAttribute("apwd");
			int adminId=aservice.getAdminId(userName, password);
	       
			Admin admin = aservice.getAdmin(adminId);
	        map.addAttribute("adminId", admin.getAdminId());
	        map.addAttribute("userName", admin.getUserName());
	        map.addAttribute("email", admin.getEmail());
	        map.addAttribute("password", admin.getPassword());
	        map.addAttribute("mobile", admin.getMobile());
	        map.addAttribute("address", admin.getAddress());



	        return "AdminUpdate";
	    }

	    @RequestMapping(value = "/updateadm", method = RequestMethod.POST)
	    public String updateAdmin1(ModelMap map, @ModelAttribute("admin") Admin admin, HttpSession session) {
	    	String userName = (String) session.getAttribute("aname");
			String password = (String) session.getAttribute("apwd");
			int adminId=aservice.getAdminId(userName, password);

	        Admin adminToUpdate = aservice.getAdmin(adminId);
	        adminToUpdate.setUserName(admin.getUserName());
	        adminToUpdate.setEmail(admin.getEmail());
	        adminToUpdate.setPassword(admin.getPassword());
	        adminToUpdate.setAddress(admin.getAddress());
	        adminToUpdate.setMobile(admin.getMobile());

	        if(aservice.saveAdmins1(adminToUpdate)) {
	            map.addAttribute("updatemsg", "Profile Updated Successfully!!");
	        } else {
	            map.addAttribute("updatemsg", "Profile Updation Failed!!");
	        }
	        map.addAttribute("aname", userName);
	        map.addAttribute("adminId", adminId);
	        return "login";
	    }
	    
		
		//## Insert Cab ##
		

		@RequestMapping(value = "/insertCab", method = RequestMethod.GET)
		public ModelAndView bookRide(Model map,HttpSession session) {
			
			String userName = (String) session.getAttribute("uname");
			String password = (String) session.getAttribute("pwd");
			int customerId = cservice.getCustomerId(userName, password);
			
			ModelAndView mav = new ModelAndView("CabData");
			return mav;
		}
	    
	    
		// Add Cab
		@RequestMapping(value="/addtocab" ,method=RequestMethod.POST)
		public String insertcab(Model map, HttpServletRequest request, HttpSession session) {
			String userName = (String) session.getAttribute("aname");
		String password = (String) session.getAttribute("apwd");
			int adminId=aservice.getAdminId(userName, password);
			
			Cab cab =  new Cab();
			
			String type= request.getParameter("type");
			int rate=  Integer.parseInt(request.getParameter("rate"));
			
			cab.setCarType(type);
			cab.setPerKmRate(rate);
			//cab.setDiver(null);
			
			
			cabservice.insertCab(cab);
			map.addAttribute("userText", "Cab data saved Successfully");
			return "AdminHome";
			
		}
		
		// Delete All Cab
		
//		@RequestMapping(value="/deletecablist/{customerId}" ,method=RequestMethod.GET)
//		public  String deleteCablist(Model map,HttpSession session){
//
//			
//			//int customerId = cservice.getCustomerId(userName, password);
//			Customer customer = cservice.get;
//	        map.addAttribute("customerId", customer.getCustomerId());
//			  cservice.deleteCabList(customerId);
//			return "login";
//			
//		}
		
		
}
