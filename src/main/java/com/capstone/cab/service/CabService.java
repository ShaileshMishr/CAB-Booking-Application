package com.capstone.cab.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.cab.model.Cab;
import com.capstone.cab.model.Customer;
import com.capstone.cab.model.Driver;
import com.capstone.cab.repository.CabRepo;




@Service
public class CabService implements CabMethod{
	
	@Autowired
	CabRepo cabRepo;

	public List<Cab> getCabs(){
		
		List<Cab> cab = (List<Cab>)cabRepo.findAll();
		return cab;
	}
	
	public void saveCabs(Customer cust) {
		cabRepo.save(cust);
	}
	
	
	// Insert Cab
	@Override
	public Cab insertCab(Cab cab) {
		Cab savedCab = cabRepo.save(cab);
		
		return savedCab;
	}

	// Update Cab
	@Override
	public Cab updateCab(Cab cab) {
		Optional<Cab> opt= cabRepo.findById(cab.getCabId());
		
		if (opt.isPresent()) {
			
			Cab updatedCab = cabRepo.save(cab);					
			return updatedCab;
			
		} else {
		}
		return cab;
		
	}

	// Delete Cab
	@Override
	public Cab deleteCab(Integer cabId) {
Optional<Cab> opt= cabRepo.findById(cabId);
		
		if(opt.isPresent()) {
			
			Cab existingCab= opt.get();
			cabRepo.delete(existingCab);
			
			return existingCab;
			
		}else {
			}
		return null;
	}

	// View cabs by type implementation
//	@Override
//	public List<Cab> viewCabsOfType(String carType) {
//		List<Cab> cabs= cabRepo.findByCarType(carType);
//			return cabs;
//		
//	}
	
	



	@Override
	public List<Cab> findById(List<Integer> cabId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	  // Cab Via Type
//    
//    public List<Cab> cabs() {
//        List<Cab> allcabs = getCabs();
//        List<Cab> typeCabs = (List<Cab>) allcabs.stream().filter(cab -> {
//        	    cab.getCarType()
//                ).
//                collect(Collectors.toList());
//        return typeCabs;
//    }
	
}
