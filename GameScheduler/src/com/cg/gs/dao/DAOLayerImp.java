package com.cg.gs.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.cg.gs.beans.Day;
import com.cg.gs.beans.DaySummary;
import com.cg.gs.beans.Game;
import com.cg.gs.beans.GameSummary;
import com.cg.gs.beans.Player;
import com.cg.gs.beans.PlayerSummary;

public class DAOLayerImp implements DAOLayer{
	HashSet<PlayerSummary> psum = new HashSet<PlayerSummary>();
	HashSet<DaySummary> dsum = new HashSet<DaySummary>();
	HashSet<GameSummary> gsum = new HashSet<GameSummary>();

	@Override
	public Player addPlayer(Player player) {
		Map<Game, List<Day>> playersum = null;
		PlayerSummary ps = new PlayerSummary(player, playersum);
		psum.add(ps);
		return player;
	}

	@Override
	public Game addGame(Game game) {
		List<String> players;
		List<String> days;
		GameSummary gs = new GameSummary(game, null, null);
		gsum.add(gs);
		return game;
	}

	@Override
	public Day addDay(Day day) {
//		DaySummary ds = new DaySummary(day, daysummary);
//		dsum.add(ds);
		return day;
	}

	@Override
	public PlayerSummary findPlayerInformation(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameSummary findGameInformation(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaySummary findDayInformation(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Game populateGames(String name) {
		Game newgame = new Game(name);
		return newgame;
	}
	
	@Override
	public List<String> populateList(String input, int x){
		List<String> sample = new ArrayList<>();;
		for(int i=0; i<x; i++) {
			sample.add(input);
		}
		return sample;
	}

}
