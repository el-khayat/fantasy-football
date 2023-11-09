package com.fantasy.football.repositories;
import com.fantasy.football.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fantasy.football.entities.Stadium;

public interface StadiumRepository extends JpaRepository<Stadium,Long> {

    Stadium getAllByMatch(Match match);
}








