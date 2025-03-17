package com.pl.premier_pick.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByPlayerName(String playerName);  // Use camelCase

    Optional<Player> findByPlayerName(String playerName);  // Use camelCase
}
