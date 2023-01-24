package com.capstone.cab.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "AbstractUser")
public class AbstractUser {

	
	private String userName;
  
	private String password;

	
	private String mobile;

	
	private String email;

	
	private String address;

}
