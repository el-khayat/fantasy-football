package com.fantasy.football.controllers;

import com.fantasy.football.entities.Player;
import com.fantasy.football.repositories.PlayerRepositories;
import com.fantasy.football.services.PlayerService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlayerController {

     private final PlayerService service ;

//    @Autowired
//    public PlayerController(PlayerService service) {
//        this.service = service;
//    }
    
    @GetMapping
    public String sayHello(){
        return "Hello Fantasy !";
    }
    @GetMapping("/api/player")
    public List<Player> getAll(){
        return service.getAll() ;
    }
    @GetMapping("/api/player/{id}")
    public Player getOne(@PathVariable Long id){
        return service.getOne(id) ;
    }
    @PostMapping("/api/player")
    public Player save(@RequestBody Player player){
        return service.save(player);
    }
    @PutMapping("/api/player")
    public Player update(@RequestBody Player player){
        return service.save(player);
    }
    @DeleteMapping("/api/player")
    public void delete(@RequestBody Player player){
        service.delete(player);
    }
    @DeleteMapping("/api/player/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

}
