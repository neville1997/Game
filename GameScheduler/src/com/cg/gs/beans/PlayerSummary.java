package com.cg.gs.beans;

import java.util.List;
import java.util.Map;

public class PlayerSummary {
	Player player;
	Map<Game, List<Day>> playersummary;
	
	public PlayerSummary(Player player, Map<Game, List<Day>> playersummary) {
		super();
		this.player = player;
		this.playersummary = playersummary;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Map<Game, List<Day>> getPlayersummary() {
		return playersummary;
	}
	public void setPlayersummary(Map<Game, List<Day>> playersummary) {
		this.playersummary = playersummary;
	}
	
}
