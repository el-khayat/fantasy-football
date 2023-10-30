package com.fantasy.football.services;

import com.fantasy.football.entities.Player;
import com.fantasy.football.entities.Team;
import com.fantasy.football.repositories.PlayerRepositories;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepositories playerRepositories ;

//    @Autowired
//    public PlayerService(PlayerRepositories playerRepositories){
//        this.playerRepositories = playerRepositories;
//    }

    public Player getOne(Long id){return playerRepositories.findById(id).get();}
    public List<Player> getAll(){return playerRepositories.findAll();}
    public Player save(Player player){
        return playerRepositories.save(player);
    }
    public Player update(Player player){
        return playerRepositories.save(player);
    }
    public void delete(Player player){
        playerRepositories.delete(player);
    }
    public void deleteById(Long id){
        playerRepositories.deleteById(id);
    }

    public List<Player> getAllByTeam(Team team){
        return playerRepositories.getAllByTeam(team);
    }
    public List<Player> getAllByTeamAndPost(Team team,String post){
        return playerRepositories.getAllByTeamAndPost(team,post);
    }
}
