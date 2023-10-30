package com.fantasy.football.repositories;

import com.fantasy.football.entities.Match;
import com.fantasy.football.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface MatchRepository extends JpaRepository<Match,Long> {
    List<Match> getAllByDate(LocalDate date);
//    List<Match> findAllByDateBeforeAndTimeBefore(LocalDate date, LocalTime time);
    List<Match> findAllByDateBeforeOrDateEqualsAndTimeBefore(LocalDate date1,LocalDate date2, LocalTime time);
}
