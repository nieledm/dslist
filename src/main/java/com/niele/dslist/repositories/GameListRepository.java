package com.niele.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niele.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
