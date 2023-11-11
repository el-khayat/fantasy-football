package com.fantasy.football.repositories;

import com.fantasy.football.entities.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PlayerRepositoriesTest {

    @Autowired
    PlayerRepositories underTest ;

    @BeforeEach
    void setUp() {

        underTest.deleteAll();
    }

    @Test
    void findByName() {
        // Arrange
        Player player1 = new Player();
        player1.setName("Brahim Nakach");
        underTest.save(player1);

        Player player2 = new Player();
        player2.setName("Mohamed Zrida");
        underTest.save(player2);

        // Act
        List<Player> foundPlayers = underTest.findByName("Brahim Nakach");

        // Assert
        assertAll(
                () -> assertNotNull(foundPlayers),
                () -> assertEquals(2, foundPlayers.size()),
                () -> assertEquals("Brahim Nakach", foundPlayers.get(0).getName())
                // add more assertions as needed based on your Player class
        );
    }
}
