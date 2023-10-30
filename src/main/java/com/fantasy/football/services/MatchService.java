package com.fantasy.football.services;

import com.fantasy.football.entities.Match;
import com.fantasy.football.entities.Player;
import com.fantasy.football.repositories.MatchRepository;
import com.fantasy.football.repositories.PlayerRepositories;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final MatchRepository matchRepository ;



    public Match getOne(Long id){return matchRepository.findById(id).get();}
    public List<Match> getAll()     {return matchRepository.findAll();}
    public Match save(Match match){
        return matchRepository.save(match);
    }
    public Match update(Match match){
        return matchRepository.save(match);
    }
    public void delete(Match match){
        matchRepository.delete(match);
    }
    public void deleteById(Long id){
        matchRepository.deleteById(id);
    }
    public List<Match> getAllByDate(LocalDate date){
        return matchRepository.getAllByDate(date);
    }

    public List<Match> deletePastMatches() {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        List<Match> pastMatches = matchRepository.findAllByDateBeforeOrDateEqualsAndTimeBefore(currentDate,currentDate, currentTime);

        matchRepository.deleteAll(pastMatches);
        return pastMatches ;
    }

}
