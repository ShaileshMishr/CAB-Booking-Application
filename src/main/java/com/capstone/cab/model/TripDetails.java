package com.capstone.cab.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


@Table(name = "TripDetails")
public class TripDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tripBookingId;
	
	@NotEmpty(message = "startingLocation can not be empty")
	private String startingLocation;
	
	@NotEmpty(message = "destination can not be empty")
	private String destination;
	
	@NotNull(message = "distance value cannot be null")
	private Double distanceInKM;
	
	private Double bill;
	
	private LocalDate date;
	
	private LocalTime time;
	
	private LocalDate fromDate;
	
	private LocalDate toDate;
	
	private Integer cabId;
	
	private String carType;
	
	
	  @OneToOne(cascade = CascadeType.ALL) private Customer customer;
	  
	  @ManyToOne(cascade = CascadeType.ALL) private Driver cabdriver;
	 
	
	//private Integer driverId;
	
}
