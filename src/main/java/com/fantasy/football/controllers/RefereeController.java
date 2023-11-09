package com.fantasy.football.controllers;

import com.fantasy.football.entities.Referee;


import com.fantasy.football.services.RefereeService;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/referee")
public class RefereeController {

    private final RefereeService service ;
  


    @GetMapping()
    public List<Referee> getAll(){
        return service.getAll() ;
    }
    @GetMapping("{idreferee}")
    public Referee getOne(@PathVariable Long idreferee){
        return service.getOne(idreferee) ;
    }
    @PostMapping()
    public Referee save(
                         @RequestParam String name,
                         @RequestParam String nationalite 
                         ){


        Referee referee = new Referee(null,name,nationalite);
        return service.save(referee);
    }
    
    @PutMapping()
    public Referee update(@RequestBody Referee referee){
        return service.save(referee);
    }
    @DeleteMapping()
    public void delete(@RequestBody Referee referee){
        service.delete(referee);
    }
    @DeleteMapping("{idreferee}")
    public void deleteById(@PathVariable Long idreferee){
        service.deleteById(idreferee);
    }



}
