package com.fantasy.football.services;

import com.fantasy.football.entities.Referee;
import com.fantasy.football.repositories.RefereeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RefereeService {

    private final RefereeRepository refereeRepository ;

    public Referee getOne(Long idreferee){return refereeRepository.findById(idreferee).get();}
    public List<Referee> getAll()     {return refereeRepository.findAll();}
    
    public Referee save(Referee referee){
        return refereeRepository.save(referee);
    }
    public Referee update(Referee referee){
        return refereeRepository.save(referee);
    }
    public void delete(Referee referee){
        refereeRepository.delete(referee);
    }
    public void deleteById(Long idreferee){
        refereeRepository.deleteById(idreferee);
    }
}
