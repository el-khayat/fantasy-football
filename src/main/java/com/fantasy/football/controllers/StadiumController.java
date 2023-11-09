

package com.fantasy.football.controllers;

import com.fantasy.football.entities.Stadium;


import com.fantasy.football.services.StadiumService;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/stadium")
public class StadiumController {

    private final StadiumService service ;
  


    @GetMapping()
    public List<Stadium> getAll(){
        return service.getAll() ;
    }
    @GetMapping("{idstadium}")
    public Stadium getOne(@PathVariable Long idstadium){
        return service.getOne(idstadium) ;
    }
    @PostMapping()
    public Stadium save(@RequestBody Stadium stadium
                         ){
        return service.save(stadium);
    }
    
    @PutMapping()
    public Stadium update(@RequestBody Stadium stadium){
        return service.save(stadium);
    }
    @DeleteMapping()
    public void delete(@RequestBody Stadium stadium){
        service.delete(stadium);
    }
    @DeleteMapping("{idstadium}")
    public void deleteById(@PathVariable Long idstadium){
        service.deleteById(idstadium);
    }



}
