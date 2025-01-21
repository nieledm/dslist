package com.niele.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niele.dslist.dto.GameMinDTO;
import com.niele.dslist.entities.Game;
import com.niele.dslist.repositories.GameRepository;

//Injetando dependencias de componentes no sistema
@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	/*public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}*/
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
