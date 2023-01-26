package com.capstone.cab.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Cab")
public class Cab {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cabId;
	
	@NotNull(message = "Car type should not be null")
	
	private String carType;
	
	@NotNull(message = "Per Kilometer rate can not be null or empty")
	private int perKmRate;
	
	
	
	  @OneToOne(cascade = CascadeType.ALL, mappedBy = "cab" ) private Driver diver;
	 

	//private Integer driverId;
}
