package com.cg.gs.service;

import com.cg.gs.beans.Day;
import com.cg.gs.beans.DaySummary;
import com.cg.gs.beans.Game;
import com.cg.gs.beans.GameSummary;
import com.cg.gs.beans.Player;
import com.cg.gs.beans.PlayerSummary;
import com.cg.gs.exception.DayException;
import com.cg.gs.exception.GameException;
import com.cg.gs.exception.PlayerException;

public interface ServiceLayer {
	public Player addPlayer(Player player);
	public Game addGame(Game game);
	public Day addDay(Day day);
	public PlayerSummary findPlayerInformation(String name);
	public GameSummary findGameInformation(String name);
	public DaySummary findDayInformation(String name);
	public boolean validateGame(Game game) throws GameException;
	public boolean validateDay(Day day) throws DayException;
	public boolean validatePlayer(Player player) throws PlayerException;
}
