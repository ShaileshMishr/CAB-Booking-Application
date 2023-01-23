package com.capstone.cab.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor 
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)


@Table(name = "Admin")
public class Admin extends AbstractUser{
	
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private Integer adminId;
//     private String name;
 

}
