package com.niele.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niele.dslist.dto.GameDTO;
import com.niele.dslist.dto.GameMinDTO;
import com.niele.dslist.entities.Game;
import com.niele.dslist.repositories.GameRepository;

//Injetando dependencias de componentes no sistema
@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	// Anotation para o método se torne "transacional" (ASID)
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	
	/*public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}*/
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
