package com.fantasy.football.repositories;

import com.fantasy.football.entities.Match;
import com.fantasy.football.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match,Long> {

}
