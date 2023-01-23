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
  
	@Size(min = 6, max = 15, message = "password length should be in between 6 - 15 character")
	@Pattern(regexp = "[a-z]{2,7}[A-Z]{2,7}[#@$%&*]{1,2}[0-9]{1,9}", message = "password should look like abcABC@999, Morethan 2 lowercase, upercase and number ")
	private String password;

	@Size(max = 10, message = "Not valid mobile number size more than 10 digits")
	private String mobile;

	@Email(message = "Not valid mail id")
	private String email;

	
	private String address;

}
