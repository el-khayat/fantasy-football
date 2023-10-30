package com.fantasy.football.repositories;

import com.fantasy.football.entities.Player;
import com.fantasy.football.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {

}
