package com.cg.gs.beans;

import java.util.List;
import java.util.Map;

public class PlayerSummary {
	Player player;
	Map<Game, List<Day>> playersum;
	
	public PlayerSummary(Player player, Map<Game, List<Day>> playersum) {
		super();
		this.player = player;
		this.playersum = playersum;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Map<Game, List<Day>> getPlayersummary() {
		return playersum;
	}
	public void setPlayersummary(Map<Game, List<Day>> playersum) {
		this.playersum = playersum;
	}
	
}
