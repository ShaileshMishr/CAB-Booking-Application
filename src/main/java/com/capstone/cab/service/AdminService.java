package com.capstone.cab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.cab.model.Admin;
import com.capstone.cab.model.Driver;
import com.capstone.cab.repository.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo admrepo;
	
public List<Admin> getAdmins(){
		
		List<Admin> adm = (List<Admin>)admrepo.findAll();
		return adm;
	}
	
	public void saveAdmin(Admin admi) {
		admrepo.save(admi);
	}
	
	public int getAdminId(String userName, String password) {
		List<Admin> adm = (List<Admin>)admrepo.findAll();
		int adminid = 0;
		for(Admin ad: adm) {
			if(ad.getUserName().equals(userName) && ad.getPassword().equals(password))
			{
				adminid=ad.getAdminId();
			}
		}
		return adminid;
		}


	// Insert Admin
	
	public void save(Admin admin) {
		admrepo.save(admin);
	}
	
	 //### GET ADMIN BY ID ###
	public Admin getAdmin(int adminId) {
		return admrepo.findById(adminId).get();
	}
	
	//### DELETE Admin ###
	
			public void deleteAdmin(int adminId) {
				admrepo.deleteById(adminId);
				
			}
	
			//### Update Admin ###

			
			public boolean saveAdmins1(Admin adm) {
				Admin c1 = admrepo.save(adm);
				if(c1 != null)
					return true;
				else {
					return false;
				}
			}
}
