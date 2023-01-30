package com.capstone.cab.service;

import java.util.List;

import com.capstone.cab.model.Cab;


	public interface CabMethod {

	public Cab insertCab(Cab cab);
	
	List<Cab> findById(List<Integer> cabId);
	
	public Cab updateCab(Cab cab);
	
	public  Cab deleteCab(Integer cabId);
	
	
}
