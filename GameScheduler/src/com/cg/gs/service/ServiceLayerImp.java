package com.cg.gs.service;

import java.util.List;

import com.cg.gs.beans.Day;
import com.cg.gs.beans.DaySummary;
import com.cg.gs.beans.Game;
import com.cg.gs.beans.GameSummary;
import com.cg.gs.beans.Player;
import com.cg.gs.beans.PlayerSummary;
import com.cg.gs.dao.DAOLayer;
import com.cg.gs.dao.DAOLayerImp;
import com.cg.gs.exception.DayException;
import com.cg.gs.exception.GameException;
import com.cg.gs.exception.PlayerException;

public class ServiceLayerImp implements ServiceLayer{
	DAOLayer dao = new DAOLayerImp();

	@Override
	public Player addPlayer(Player player) {
		return dao.addPlayer(player);
	}

	@Override
	public Game addGame(Game game) {
		return dao.addGame(game);
	}

	@Override
	public Day addDay(Day day) {
		return dao.addDay(day);
	}

	@Override
	public PlayerSummary findPlayerInformation(String name) {
		return dao.findPlayerInformation(name);
	}

	@Override
	public GameSummary findGameInformation(String name) {
		return dao.findGameInformation(name);
	}

	@Override
	public DaySummary findDayInformation(String name) {
		return dao.findDayInformation(name);
	}
	
	@Override
	public Game populateGames(String name) {
		return dao.populateGames(name);
	}
	
	@Override
	public List<String> populateList(String input, int x){
		return dao.populateList(input, x);
	}
	
	public boolean validatePlayer(Player player) throws PlayerException{
		return true;
	}
	public boolean validateDay(Day day) throws DayException{
		
		return true;
	}
	public boolean validateGame(Game game) throws GameException{
		
		return true;
	}
	
	
}
