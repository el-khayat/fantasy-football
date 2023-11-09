package com.fantasy.football.controllers;

import com.fantasy.football.entities.Match;
import com.fantasy.football.entities.Player;
import com.fantasy.football.entities.Stadium;
import com.fantasy.football.entities.Team;
import com.fantasy.football.repositories.StadiumRepository;
import com.fantasy.football.services.MatchService;
import com.fantasy.football.services.PlayerService;
import com.fantasy.football.services.StadiumService;
import com.fantasy.football.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/match")
public class MatchController {

     private final MatchService service ;
    private final StadiumService stadiumService ;
    private final TeamService teamService ;


    @GetMapping()
    public List<Match> getAll(){
        return service.getAll() ;
    }

    @GetMapping("{id}")
    public Match getOne(@PathVariable Long id){
        return service.getOne(id) ;
    }

    @PostMapping()
    public Match save(@RequestParam LocalDate date,
                      @RequestParam  LocalTime time,
                      @RequestParam Long stadium_id,
                      @RequestParam Long team_home_id,
                      @RequestParam Long team_away_id
    ){
        System.out.println();
        System.out.println(date);
        System.out.println(time);
        System.out.println(stadium_id);

        Match match = new Match(null,date,time);

        Stadium stadium = stadiumService.getOne(stadium_id);
        Team teamHome  = teamService.getOne(team_home_id);
        Team teamAway  = teamService.getOne(team_away_id);
        match.setStadium(stadium);
        match.setTeamHome(teamHome);
        match.setTeamAway(teamAway);
        return service.save(match);
    }

    @PutMapping()
    public Match update(@RequestBody Match match){
        return service.save(match);
    }

    @DeleteMapping()
    public void delete(@RequestBody Match match){
        service.delete(match);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

    @GetMapping("/date/{date}")
    public List<Match> getAllByDate(@PathVariable LocalDate date){
        System.out.println();
        System.out.println("Fetching date ...");
        System.out.println(date);
        System.out.println();
        System.out.println();
        return service.getAllByDate(date);
    }
    @DeleteMapping("/deletepastmatches")
    public List<Match> deletePastMatches() {
        return service.deletePastMatches( );
    }
}
