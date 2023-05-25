package com.frandev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.frandev.dslist.dtos.GameListDTO;
import com.frandev.dslist.entities.GameList;
import com.frandev.dslist.projections.GameMinProjection;
import com.frandev.dslist.repositories.GameListRepository;
import com.frandev.dslist.repositories.GameRepository;



public class GameListService {
  @Autowired
	private GameListRepository gameListRepository;
	
	//@Autowired
	//private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	// @Transactional
	// public void move(Long listId, int sourceIndex, int destinationIndex) {

	// 	List<GameMinProjection> list = gameRepository.searchByList(listId);

	// 	GameMinProjection obj = list.remove(sourceIndex);
	// 	list.add(destinationIndex, obj);

	// 	int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
	// 	int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

	// 	for (int i = min; i <= max; i++) {
	// 		gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
	// 	}
	// }
}
