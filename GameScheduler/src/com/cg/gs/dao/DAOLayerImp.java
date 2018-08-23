package com.cg.gs.dao;

import java.util.HashSet;
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
		PlayerSummary ps = new PlayerSummary(player, null);
		psum.add(ps);
		return player;
	}

	@Override
	public Game addGame(Game game) {
		GameSummary gs = new GameSummary(game, null, null);
		gsum.add(gs);
		return game;
	}

	@Override
	public Day addDay(Day day) {
		DaySummary ds = new DaySummary(day, null);
		dsum.add(ds);
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

}
