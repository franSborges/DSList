package com.frandev.dslist.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frandev.dslist.dtos.GameListDTO;
import com.frandev.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  
	@Autowired
	private GameListService gameListService;

  @GetMapping
	public List<GameListDTO> findAll() {
		return gameListService.findAll();
	}

  // @GetMapping
  // public List<GameMinDTO> findById() {
  //   return gameService.findAll();
  // }
  
}
