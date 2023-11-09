package com.fantasy.football.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "referee")
@Getter
@Setter
@RequiredArgsConstructor

public class Referee {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idreferee;
	 private String name;
	 private String nationalite;
	 
	 
	public Referee(Long idreferee, String name, String nationalite) {
		super();
		this.idreferee = idreferee;
		this.name = name;
		this.nationalite = nationalite;
	}
	 
	      
	    

}








    
   
    
   

