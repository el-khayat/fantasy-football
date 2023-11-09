package com.fantasy.football.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
 @Entity
 @Table(name = "stadium")
 @Getter
 @Setter
 @RequiredArgsConstructor

public class Stadium {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idstadium;
	 private String name;
	 private String city;
	 
	 
	public Stadium(Long idstadium, String name, String city) {
		super();
		this.idstadium = idstadium;
		this.name = name;
		this.city = city;
	}

}







	      
	    










    
   
    
   

