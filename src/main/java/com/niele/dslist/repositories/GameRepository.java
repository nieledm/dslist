package com.niele.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niele.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
