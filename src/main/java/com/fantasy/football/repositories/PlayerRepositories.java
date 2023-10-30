package com.fantasy.football.repositories;

import com.fantasy.football.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepositories extends JpaRepository<Player,Long> {

}
