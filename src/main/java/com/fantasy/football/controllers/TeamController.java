package com.fantasy.football.controllers;

import com.fantasy.football.entities.Match;
import com.fantasy.football.entities.Player;
import com.fantasy.football.entities.Team;
import com.fantasy.football.services.MatchService;
import com.fantasy.football.services.PlayerService;
import com.fantasy.football.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/team")
public class TeamController {

     private final TeamService service ;
     private final MatchService matchService;

    @GetMapping()
    public List<Team> getAll(){
        return service.getAll() ;
    }
    @GetMapping("{id}")
    public Team getOne(@PathVariable Long id){
        return service.getOne(id) ;
    }
    @PostMapping()
    public Team save(@RequestBody Team team){
        return service.save(team);
    }
    @PutMapping()
    public Team update(@RequestBody Team team){
        return service.save(team);
    }
    @DeleteMapping()
    public void delete(@RequestBody Team team){
        service.delete(team);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    @GetMapping("/country/{country}")
    public List<Team> getTeamByCountry(@PathVariable String country){
        return  service.getTeamByCountry(country);
    }
    @GetMapping("/match/{match_id}")
    public List<Team> getTeamByMatch(@PathVariable Long match_id){
        Match match = matchService.getOne(match_id);
        List<Team> teams = new ArrayList<Team>();
        teams.add(match.getTeamHome());
        teams.add(match.getTeamAway());
        return  teams;
    }

}
