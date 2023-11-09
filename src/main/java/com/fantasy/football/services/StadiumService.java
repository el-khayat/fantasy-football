
package com.fantasy.football.services;

import com.fantasy.football.entities.Stadium;
import com.fantasy.football.repositories.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StadiumService {

    private final StadiumRepository stadiumRepository ;

    public Stadium getOne(Long idstadium){return stadiumRepository.findById(idstadium).get();}
    
    public List<Stadium> getAll()     {return stadiumRepository.findAll();}
    
    public Stadium save(Stadium stadium){
        return stadiumRepository.save(stadium);
    }
    public Stadium update(Stadium stadium){
        return stadiumRepository.save(stadium);
    }
    public void delete(Stadium stadium){
        stadiumRepository.delete(stadium);
    }
    public void deleteById(Long idstadium){
        stadiumRepository.deleteById(idstadium);
    }
}
