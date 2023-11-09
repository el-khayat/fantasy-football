package com.fantasy.football.repositories;

import com.fantasy.football.entities.Player;
import com.fantasy.football.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepositories extends JpaRepository<Player,Long> {
    List<Player> getAllByTeam(Team team);
    List<Player> getAllByTeamAndPost(Team team,String post);

}
