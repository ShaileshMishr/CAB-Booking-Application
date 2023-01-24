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
import com.capstone.cab.service.AdminService;
import com.capstone.cab.service.LoginService;

@Controller
public class AdminController {

	@Autowired
	LoginService service;
	
	@Autowired
	AdminService aservice;
	
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
		public String save(Model map, HttpServletRequest request) throws CustomerException {
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
			return "sucess";
			
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
		
		
}
