package com.cg.gs.dao;

import java.util.List;

import com.cg.gs.beans.Day;
import com.cg.gs.beans.DaySummary;
import com.cg.gs.beans.Game;
import com.cg.gs.beans.GameSummary;
import com.cg.gs.beans.Player;
import com.cg.gs.beans.PlayerSummary;

public interface DAOLayer {
	public Player addPlayer(Player player);
	public Game addGame(Game game);
	public Day addDay(Day day);
	public PlayerSummary findPlayerInformation(String name);
	public GameSummary findGameInformation(String name);
	public DaySummary findDayInformation(String name);
//	public Game addGame(String name);
//	public Player addPlayer(String name, List<Game> games);
//	public Day addDay(String name, List<Game> games); 
	public Game populateGames(String name);
	public List<String> populateList(String input, int x);
}
