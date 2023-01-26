package com.capstone.cab.model;

import javax.persistence.Column;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table(name = "Driver")
public class Driver extends AbstractUser{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer driverId;
	
	
	 private boolean available = true;
	 
	@Column(nullable = true)
	private Float rating;
	
	private String licenceNo;
	
	
	
	  @OneToMany(cascade = CascadeType.ALL, mappedBy = "cabdriver", orphanRemoval =
	  true) private List<TripDetails> tripList = new ArrayList<>();
	 
	
	

	
	  @OneToOne(cascade = CascadeType.ALL ,orphanRemoval = true) private Cab cab;
	 
	
	




}
