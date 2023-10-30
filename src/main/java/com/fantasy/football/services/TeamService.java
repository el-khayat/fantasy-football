package com.fantasy.football.services;

import com.fantasy.football.entities.Player;
import com.fantasy.football.entities.Team;
import com.fantasy.football.repositories.PlayerRepositories;
import com.fantasy.football.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository ;

    public Team getOne(Long id){return teamRepository.findById(id).get();}
    public List<Team> getAll(){return teamRepository.findAll();}
    public Team save(Team team){
        return teamRepository.save(team);
    }
    public Team update(Team team){
        return teamRepository.save(team);
    }
    public void delete(Team team){
        teamRepository.delete(team);
    }
    public void deleteById(Long id){
        teamRepository.deleteById(id);
    }
    public List<Team> getTeamByCountry(String country){
        return  teamRepository.getTeamByCountry(country);
    }

}
