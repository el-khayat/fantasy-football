package com.fantasy.football.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "matches")
@Getter
@Setter
@RequiredArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "sadium_id")
    private Stadium stadium ;

    @ManyToOne
    @JoinColumn(name = "team_home")
    private Team teamHome;

    @ManyToOne
    @JoinColumn(name = "team_away")
    private Team teamAway;


    public Match(Long id, LocalDate date, LocalTime time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }
}
