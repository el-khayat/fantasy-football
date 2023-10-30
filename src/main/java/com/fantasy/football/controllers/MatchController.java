package com.fantasy.football.controllers;

import com.fantasy.football.entities.Match;
import com.fantasy.football.entities.Player;
import com.fantasy.football.services.MatchService;
import com.fantasy.football.services.PlayerService;
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
                      @RequestParam  LocalTime time){
        System.out.println();
        System.out.println(date);
        System.out.println(time);
        System.out.println();
        Match match = new Match(null,date,time);

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
