package com.fantasy.football.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

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

	 @OneToMany(mappedBy = "stadium")
	 @JsonIgnore
	 private List<Match> match;
	 
	public Stadium(Long idstadium, String name, String city) {
		super();
		this.idstadium = idstadium;
		this.name = name;
		this.city = city;
	}

}







	      
	    










    
   
    
   

