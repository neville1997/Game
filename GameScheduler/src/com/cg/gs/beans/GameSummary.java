package com.cg.gs.beans;

import java.util.List;

public class GameSummary {
	Game game;
	List<String> players;
	List<String> days;
	
	
	public GameSummary(Game game, List<String> players, List<String> days) {
		super();
		this.game = game;
		this.players = players;
		this.days = days;
	}
	
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	public List<String> getDays() {
		return days;
	}
	public void setDays(List<String> days) {
		this.days = days;
	}
	
}
