package com.frandev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frandev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
  

}
