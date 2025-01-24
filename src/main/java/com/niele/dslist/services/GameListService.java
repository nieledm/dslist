package com.niele.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niele.dslist.dto.GameListDTO;
import com.niele.dslist.entities.GameList;
import com.niele.dslist.projections.GameMinProjection;
import com.niele.dslist.repositories.GameListRepository;
import com.niele.dslist.repositories.GameRepository;

//Injetando dependencias de componentes no sistema
@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();		
	}
	
	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		
		List<GameMinProjection> list = gameRepository.searchByList(listId);	
		
		//Removendo e add o obj da posição atual para a nova posição
		GameMinProjection obj = list.remove(sourceIndex);	
		list.add(destinationIndex, obj);
		
		//Variáveis para alterar a lista ou do inicio até o destino ou do destino até o inicio
		//Isso vai depender da diferença dos index inicial e final
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		//Atualizando posição na lista
		for (int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	}

}
