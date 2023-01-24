package com.capstone.cab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.cab.model.Cab;
import com.capstone.cab.repository.CabRepo;




@Service
public class CabService implements CabMethod{
	
	@Autowired
	private CabRepo cabRepo;

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
	@Override
	public List<Cab> viewCabsOfType(String carType) {
		List<Cab> cabs= cabRepo.findByCarType(carType);
			return cabs;
		
	}
	
	// Count of cabs by car type implementation

	@Override
	public int countCabsOfType(String carType) {

		int count = cabRepo.getcount(carType);
		return count;
	}

	
}
