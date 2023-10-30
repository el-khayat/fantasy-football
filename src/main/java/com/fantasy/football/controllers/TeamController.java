package com.fantasy.football.controllers;

import com.fantasy.football.entities.Player;
import com.fantasy.football.entities.Team;
import com.fantasy.football.services.PlayerService;
import com.fantasy.football.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/team")
public class TeamController {

     private final TeamService service ;

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

}
