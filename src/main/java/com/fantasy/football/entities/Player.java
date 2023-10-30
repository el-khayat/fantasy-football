package com.fantasy.football.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "playes")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name ;
    private  String post ;

    @ManyToOne
    @JoinColumn(name = "team_id")

    private Team team ;


}
