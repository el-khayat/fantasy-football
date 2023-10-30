package com.fantasy.football.controllers;

import com.fantasy.football.entities.Player;
import com.fantasy.football.entities.Team;
import com.fantasy.football.repositories.PlayerRepositories;
import com.fantasy.football.services.PlayerService;
import com.fantasy.football.services.TeamService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/player")
public class PlayerController {

    private final PlayerService service ;
    private final TeamService teamService ;


    @GetMapping()
    public List<Player> getAll(){
        return service.getAll() ;
    }
    @GetMapping("{id}")
    public Player getOne(@PathVariable Long id){
        return service.getOne(id) ;
    }
    @PostMapping()
    public Player save(
                         @RequestParam String name,
                         @RequestParam String post,
                         @RequestParam Long team_id){
        Team team = teamService.getOne(team_id);
        System.out.println();
        System.out.println(name);
        System.out.println(post);
        System.out.println(team_id);
        System.out.println();
        Player player = new Player(null,name,post,team);
        return service.save(player);
    }
    @PutMapping()
    public Player update(@RequestBody Player player){
        return service.save(player);
    }
    @DeleteMapping()
    public void delete(@RequestBody Player player){
        service.delete(player);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

    @GetMapping("/team/{id}")
    public List<Player> getAllByTeam(@PathVariable Long id){
        Team team = teamService.getOne(id);
        return service.getAllByTeam(team);
    }

    @GetMapping("/team/{id}/post/{post}")
    public List<Player> getAllByTeamAndPost(@PathVariable Team team,@PathVariable String post){
        return service.getAllByTeamAndPost(team,post);
    }
}
